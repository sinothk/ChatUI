package com.sinothk.chat.ui.keyboard;


import com.sinothk.chat.ui.keyboard.utils.EmoticonBase;

/**
 * EmoticonEntity
 * @author chris
 */
public class EmoticonEntity {
    private String path;
    private EmoticonBase.Scheme scheme;

    public EmoticonEntity(String path, EmoticonBase.Scheme scheme) {
        this.path = path;
        this.scheme = scheme;
    }

    public String getPath() {
        return path;
    }

    public EmoticonBase.Scheme getScheme() {
        return scheme;
    }
}
