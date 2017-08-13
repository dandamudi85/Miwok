package com.example.android.miwok;

/**
 * Created by danda on 27-05-2017.
 */

public class Word
{
    private String mdefaultTranslation;

    private String mmiwokTranslation;

    private int mImageResourceId = -1;

    private int msoundId;



    public Word(String defaultTranslation,String miwokTranslation,int soundId)
    {
        mmiwokTranslation = miwokTranslation;
        mdefaultTranslation = defaultTranslation;
        msoundId = soundId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int resourceId,int soundId)
    {
        mmiwokTranslation = miwokTranslation;
        mdefaultTranslation = defaultTranslation;
        mImageResourceId = resourceId;
        msoundId = soundId;
    }

    public String getMiwokTranslation()
    {
       return mmiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mdefaultTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public int getsoundId()
    {
        return msoundId;
    }





}
