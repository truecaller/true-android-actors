/*
 * Copyright (C) 2017 True Software Scandinavia AB
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

package com.truecaller.androidactors;

import org.jetbrains.annotations.NotNull;

import javax.lang.model.element.Element;

/* package */ interface ModelFactory {
    @NotNull
    <T extends Element> ActorInterfaceDescription createInterfaceDescription(@NotNull T element);

    @NotNull
    <T extends Element> ActorsPackageDescription createPackageDescription(@NotNull T element);

    @NotNull
    ActorInterfaceGenerator createInterfaceGenerator(@NotNull ActorInterfaceDescription description);

    @NotNull
    ActorsPackageGenerator createBuilderGenerator(@NotNull ActorsPackageDescription description);
}
