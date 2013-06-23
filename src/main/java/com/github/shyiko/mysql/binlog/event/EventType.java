/*
 * Copyright 2013 Stanley Shyiko
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
package com.github.shyiko.mysql.binlog.event;

/**
 * @author <a href="mailto:stanley.shyiko@gmail.com">Stanley Shyiko</a>
 */
public enum EventType {

    UNKNOWN,
    START_V3,
    QUERY,
    STOP,
    ROTATE,
    INTVAR,
    LOAD,
    SLAVE,
    CREATE_FILE,
    APPEND_BLOCK,
    EXEC_LOAD,
    DELETE_FILE,
    NEW_LOAD,
    RAND,
    USER_VAR,
    FORMAT_DESCRIPTION,
    XID,
    BEGIN_LOAD_QUERY,
    EXECUTE_LOAD_QUERY,
    TABLE_MAP,
    PRE_GA_WRITE_ROWS,
    PRE_GA_UPDATE_ROWS,
    PRE_GA_DELETE_ROWS,
    WRITE_ROWS,
    UPDATE_ROWS,
    DELETE_ROWS,
    INCIDENT,
    HEARTBEAT_LOG

}