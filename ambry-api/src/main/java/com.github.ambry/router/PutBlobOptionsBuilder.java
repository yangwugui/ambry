/*
 * Copyright 2018 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package com.github.ambry.router;

/**
 * A builder for {@link PutBlobOptions} objects.
 */
public class PutBlobOptionsBuilder {
  /**
   * @return the {@link PutBlobOptions} built.
   */
  public PutBlobOptions build() {
    return new PutBlobOptions();
  }
}
