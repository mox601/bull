/**
 * Copyright (C) 2019 Expedia, Inc.
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hotels.beans.sample.immutable;

import java.util.Locale;
import java.util.Optional;

import com.hotels.beans.constant.ClassType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Sample immutable object.
 */
@AllArgsConstructor
@Getter
@ToString
public class ImmutableToFooAdvFields {
    private final Optional<String> name;
    private final Integer age;
    private final String indexNumber;
    private final ClassType classType;
    private final Locale locale;
    private final Price price;
}

@AllArgsConstructor
@Getter
class Price {
    private final float netPrice;
    private final float grossPrice;
}
