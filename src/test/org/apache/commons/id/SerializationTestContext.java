/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.id;

import org.apache.commons.id.test.AssertSerialization;

import java.io.File;


/**
 * Helper class to provide the context to test serialization compatibility of a type.
 * 
 * @author Commons-Id team
 * @version $Id: SerializationTestContext.java 480488 2006-11-29 08:57:26Z bayard $
 */
public abstract class SerializationTestContext implements AssertSerialization.Context {

    public static final File SERIALIZATION_REFERENCE_DIR = new File("src/test-serialization");

    public File getReferenceBaseDir() {
        return SERIALIZATION_REFERENCE_DIR;
    }
}
