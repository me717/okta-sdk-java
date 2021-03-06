/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.okta.sdk.impl.io

import org.testng.annotations.Test

import static org.testng.Assert.assertEquals
import static org.testng.Assert.assertNotNull

/**
 * @since 0.5.0
 */
class UrlResourceTest {

    @Test
    void testLocation() {
        def resource = new UrlResource("url:https://www.google.com")

        assertEquals resource.location, "https://www.google.com"

        // This doesn't seem right, but it's how the code is setup right now
        assertEquals resource.toString(), "urlhttps://www.google.com"
    }

    @Test
    void testInputStream() {
        def resource = new UrlResource("url:https://www.google.com")

        assertNotNull resource.inputStream
    }
}
