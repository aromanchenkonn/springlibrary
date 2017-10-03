package com.springlibrary.interfaces;

import com.springlibrary.objects.User;

public interface SecureLibrary {

    boolean login(User user);

    void logout(User user);

}
