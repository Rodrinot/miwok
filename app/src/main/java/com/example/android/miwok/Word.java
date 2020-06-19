package com.example.android.miwok;

import android.widget.ImageView;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource id */
    private int mResourceImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Audio resource id */
    private int mResourceAudioId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceAudioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceAudioId = resourceAudioId;
    }

    /**
     * Create a new Word object with image.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceImageId, int resourceAudioId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceImageId = resourceImageId;
        mResourceAudioId = resourceAudioId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the resource image id of the word.
     */
    public int getImageResourceId() { return mResourceImageId; }

    /**
     * Return if there is a valid image associated with a word or not.
     */
    public boolean hasImage() {
        return mResourceImageId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the resource image id of the word.
     */
    public int getAudioResourceId() { return mResourceAudioId; }

}
