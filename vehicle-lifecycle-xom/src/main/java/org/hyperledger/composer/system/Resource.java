/*
 *
 *   Copyright IBM Corp. 2017
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
// this code is generated and should not be modified
package org.hyperledger.composer.system;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, property = "$class")
@JsonTypeIdResolver(CustomTypeIdResolver.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "$id")
@JsonIgnoreProperties({"id"})
public abstract class Resource
{
    public abstract String getID();
    private String $id;
    
    @JsonProperty("$id")
    public String get$id() {
        return $id; 
    }
    @JsonProperty("$id")
    public void set$id(String i) {
        $id = i; 
    }

}
        
