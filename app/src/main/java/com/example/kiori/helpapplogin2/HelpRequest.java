package com.example.kiori.helpapplogin2;

import java.io.Serializable;

public class HelpRequest implements Serializable {
    private static final long serialVersionUID = -7060210544600464481L;
    String Title;
    String Desc;
    int image;

    HelpRequest(String _Title, String _Desc, int _image) {
        Title = _Title;
        Desc = _Desc;
        image = _image;
    }
}
