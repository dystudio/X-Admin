package com.leaf.xadmin.exception;

import com.leaf.xadmin.enums.ErrorStatus;

/**
 * @author leaf
 * <p>date: 2018-02-04 22:40</p>
 * <p>version: 1.0</p>
 */
public class AuthLackException extends GlobalException {
    public AuthLackException() {}
    public AuthLackException(ErrorStatus status) {
        super(status);
    }
}
