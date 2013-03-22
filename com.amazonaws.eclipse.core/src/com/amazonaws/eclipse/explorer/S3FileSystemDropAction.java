/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.explorer;

import org.eclipse.ui.part.IDropActionDelegate;

public class S3FileSystemDropAction implements IDropActionDelegate {

    public static final String ID = "com.amazonaws.eclipse.explorer.S3FileSystemDropAction";

    public boolean run(Object source, Object target) {
        return false;
    }
}
