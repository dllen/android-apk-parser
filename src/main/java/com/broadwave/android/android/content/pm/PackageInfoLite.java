/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.broadwave.android.android.content.pm;

import com.broadwave.android.android.os.Parcelable;

/**
 * Basic information about a package as specified in its manifest.
 * Utility class used in PackageManager methods
 * @hide
 */
public class PackageInfoLite implements Parcelable {
    /**
     * The name of this package.  From the &lt;manifest&gt; tag's "name"
     * attribute.
     */
    public String packageName;

    /**
     * Specifies the recommended install location. Can be one of
     * {@link #PackageHelper.RECOMMEND_INSTALL_INTERNAL} to install on internal storage
     * {@link #PackageHelper.RECOMMEND_INSTALL_EXTERNAL} to install on external media
     * {@link PackageHelper.RECOMMEND_FAILED_INSUFFICIENT_STORAGE} for storage errors
     * {@link PackageHelper.RECOMMEND_FAILED_INVALID_APK} for parse errors.
     */
    public int recommendedInstallLocation;
    public int installLocation;

    public VerifierInfo[] verifiers;

    public PackageInfoLite() {
    }

    public String toString() {
        return "PackageInfoLite{"
            + Integer.toHexString(System.identityHashCode(this))
            + " " + packageName + "}";
    }

    public int describeContents() {
        return 0;
    }

}