package net.hypixel.skyblock.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Utilities for json
 *
 * @author MrPineapple070
 * @since 11 June 2019
 * @version 20 August 2022
 */
public class JSONUtils {
	/**
	 * Empty {@link Gson}
	 */
	private static final Gson GSON = new GsonBuilder().create();

	public static boolean convertToBoolean(final JsonElement element, final String key) {
		if (element.isJsonPrimitive())
			return element.getAsBoolean();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a Boolean, was " + getType(element));
	}

	public static byte convertToByte(final JsonElement element, final String key) {
		if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber())
			return element.getAsByte();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a Byte, was " + getType(element));
	}

	public static float convertToFloat(final JsonElement element, final String key) {
		if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber())
			return element.getAsFloat();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a Float, was " + getType(element));
	}

	public static int convertToInt(final JsonElement element, final String key) {
		if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber())
			return element.getAsInt();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a Int, was " + getType(element));
	}

	@SuppressWarnings("deprecation")
	public static Item convertToItem(final JsonElement element, final String key) {
		if (element.isJsonPrimitive()) {
			final String s = element.getAsString();
			return Registry.ITEM.getOptional(new ResourceLocation(s)).orElseThrow(() -> new JsonSyntaxException(
					"Expected " + key + " to be an item, was unknown string '" + s + "'"));
		} else
			throw new JsonSyntaxException("Expected " + key + " to be an item, was " + getType(element));
	}

	public static JsonArray convertToJsonArray(final JsonElement element, final String key) {
		if (element.isJsonArray())
			return element.getAsJsonArray();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a JsonArray, was " + getType(element));
	}

	public static JsonObject convertToJsonObject(final JsonElement element, final String key) {
		if (element.isJsonObject())
			return element.getAsJsonObject();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a JsonObject, was " + getType(element));
	}

	public static long convertToLong(final JsonElement element, final String key) {
		if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isNumber())
			return element.getAsLong();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a Long, was " + getType(element));
	}

	public static <T> T convertToObject(@Nullable final JsonElement element, final String key,
			final JsonDeserializationContext context, final Class<? extends T> clazz) {
		if (element != null)
			return context.deserialize(element, clazz);
		else
			throw new JsonSyntaxException("Missing " + key);
	}

	public static String convertToString(final JsonElement object, final String key) {
		if (object.isJsonPrimitive())
			return object.getAsString();
		else
			throw new JsonSyntaxException("Expected " + key + " to be a string, was " + getType(object));
	}

	@Nullable
	public static <T> T fromJson(final Gson gson, final Reader reader, final Class<T> clazz) {
		return fromJson(gson, reader, clazz, false);
	}

	@Nullable
	public static <T> T fromJson(final Gson gson, final Reader reader, final Class<T> clazz, final boolean lenient) {
		try {
			final JsonReader jsonreader = new JsonReader(reader);
			jsonreader.setLenient(lenient);
			return gson.getAdapter(clazz).read(jsonreader);
		} catch (final IOException ioexception) {
			throw new JsonParseException(ioexception);
		}
	}

	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static <T> T fromJson(final Gson gson, final Reader reader, final TypeToken<T> type) {
		return fromJson(gson, reader, type, false);
	}

	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static <T> T fromJson(final Gson gson, final Reader reader, final TypeToken<T> type, final boolean lenient) {
		try {
			final JsonReader jsonreader = new JsonReader(reader);
			jsonreader.setLenient(lenient);
			return gson.getAdapter(type).read(jsonreader);
		} catch (final IOException ioexception) {
			throw new JsonParseException(ioexception);
		}
	}

	@Nullable
	public static <T> T fromJson(final Gson gson, final String stream, final Class<T> clazz) {
		return fromJson(gson, stream, clazz, false);
	}

	@Nullable
	public static <T> T fromJson(final Gson gson, final String stream, final Class<T> clazz, final boolean lenient) {
		return fromJson(gson, new StringReader(stream), clazz, lenient);
	}

	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static <T> T fromJson(final Gson gson, final String stream, final TypeToken<T> type) {
		return fromJson(gson, stream, type, false);
	}

	@Nullable
	@OnlyIn(Dist.CLIENT)
	public static <T> T fromJson(final Gson gson, final String stream, final TypeToken<T> type, final boolean lenient) {
		return fromJson(gson, new StringReader(stream), type, lenient);
	}

	public static boolean getAsBoolean(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToBoolean(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a Boolean");
	}

	public static boolean getAsBoolean(final JsonObject object, final String key, final boolean fall_back) {
		return object.has(key) ? convertToBoolean(object.get(key), key) : fall_back;
	}

	public static byte getAsByte(final JsonObject object, final String key, final byte fall_back) {
		return object.has(key) ? convertToByte(object.get(key), key) : fall_back;
	}

	public static float getAsFloat(final JsonObject object, final String string) {
		if (object.has(string))
			return convertToFloat(object.get(string), string);
		else
			throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
	}

	public static float getAsFloat(final JsonObject object, final String string, final float fall_back) {
		return object.has(string) ? convertToFloat(object.get(string), string) : fall_back;
	}

	public static int getAsInt(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToInt(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a Int");
	}

	public static int getAsInt(final JsonObject object, final String key, final int fall_back) {
		return object.has(key) ? convertToInt(object.get(key), key) : fall_back;
	}

	public static Item getAsItem(final JsonObject json, final String string) {
		if (json.has(string))
			return convertToItem(json.get(string), string);
		else
			throw new JsonSyntaxException("Missing " + string + ", expected to find an item");
	}

	public static JsonArray getAsJsonArray(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToJsonArray(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a JsonArray");
	}

	@Nullable
	public static JsonArray getAsJsonArray(final JsonObject object, final String key,
			@Nullable final JsonArray fall_back) {
		return object.has(key) ? convertToJsonArray(object.get(key), key) : fall_back;
	}

	public static JsonObject getAsJsonObject(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToJsonObject(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a JsonObject");
	}

	public static JsonObject getAsJsonObject(final JsonObject object, final String key, final JsonObject fall_back) {
		return object.has(key) ? convertToJsonObject(object.get(key), key) : fall_back;
	}

	public static long getAsLong(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToLong(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a Long");
	}

	public static long getAsLong(final JsonObject object, final String key, final long fall_back) {
		return object.has(key) ? convertToLong(object.get(key), key) : fall_back;
	}

	public static <T> T getAsObject(final JsonObject object, final String key, final JsonDeserializationContext context,
			final Class<? extends T> clazz) {
		if (object.has(key))
			return convertToObject(object.get(key), key, context, clazz);
		else
			throw new JsonSyntaxException("Missing " + key);
	}

	public static <T> T getAsObject(final JsonObject object, final String key, final T value,
			final JsonDeserializationContext context, final Class<? extends T> clazz) {
		return object.has(key) ? convertToObject(object.get(key), key, context, clazz) : value;
	}

	public static String getAsString(final JsonObject object, final String key) {
		if (object.has(key))
			return convertToString(object.get(key), key);
		else
			throw new JsonSyntaxException("Missing " + key + ", expected to find a string");
	}

	public static String getAsString(final JsonObject object, final String key, final String fall_back) {
		return object.has(key) ? convertToString(object.get(key), key) : fall_back;
	}

	public static String getType(final JsonElement element) {
		final String s = StringUtils.abbreviateMiddle(String.valueOf(element), "...", 10);
		if (element == null)
			return "null (missing)";
		else if (element.isJsonNull())
			return "null (json)";
		else if (element.isJsonArray())
			return "an array (" + s + ")";
		else if (element.isJsonObject())
			return "an object (" + s + ")";
		else {
			if (element.isJsonPrimitive()) {
				final JsonPrimitive jsonprimitive = element.getAsJsonPrimitive();
				if (jsonprimitive.isNumber())
					return "a number (" + s + ")";

				if (jsonprimitive.isBoolean())
					return "a boolean (" + s + ")";
			}

			return s;
		}
	}

	public static boolean isArrayNode(final JsonObject object, final String key) {
		return !isValidNode(object, key) ? false : object.get(key).isJsonArray();
	}

	@OnlyIn(Dist.CLIENT)
	public static boolean isBooleanValue(final JsonObject object, final String key) {
		return !isValidPrimitive(object, key) ? false : object.getAsJsonPrimitive(key).isBoolean();
	}

	public static boolean isNumberValue(final JsonElement element) {
		return !element.isJsonPrimitive() ? false : element.getAsJsonPrimitive().isNumber();
	}

	@OnlyIn(Dist.CLIENT)
	public static boolean isStringValue(final JsonElement element) {
		return !element.isJsonPrimitive() ? false : element.getAsJsonPrimitive().isString();
	}

	public static boolean isStringValue(final JsonObject object, final String key) {
		return !isValidPrimitive(object, key) ? false : object.getAsJsonPrimitive(key).isString();
	}

	public static boolean isValidNode(final JsonObject object, final String key) {
		if (object == null)
			return false;
		else
			return object.get(key) != null;
	}

	public static boolean isValidPrimitive(final JsonObject object, final String key) {
		return !isValidNode(object, key) ? false : object.get(key).isJsonPrimitive();
	}

	public static JsonObject parse(final Reader reader) {
		return parse(reader, false);
	}

	public static JsonObject parse(final Reader reader, final boolean lenient) {
		return fromJson(GSON, reader, JsonObject.class, lenient);
	}

	public static JsonObject parse(final String stream) {
		return parse(stream, false);
	}

	public static JsonObject parse(final String stream, final boolean lenient) {
		return parse(new StringReader(stream), lenient);
	}
}