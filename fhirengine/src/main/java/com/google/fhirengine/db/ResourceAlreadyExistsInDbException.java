// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.fhirengine.db;

/** Thrown to indicate that the resource already exists in the database. */
public class ResourceAlreadyExistsInDbException extends Exception {
  private String type;
  private String id;

  public ResourceAlreadyExistsInDbException(String type, String id, Throwable cause) {
    super("Resource with type " + type + " and id " + id + " already exists!", cause);
    this.type = type;
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public String getId() {
    return id;
  }
}
