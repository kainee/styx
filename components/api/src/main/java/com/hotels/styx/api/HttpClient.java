/**
 * Copyright (C) 2013-2017 Expedia Inc.
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
package com.hotels.styx.api;

import rx.Observable;

import java.io.Closeable;

/**
 * HTTP Client that returns an observable of response.
 */
public interface HttpClient extends Closeable {
    /**
     * Processes a new request.
     *
     * @param request HTTP request to process
     * @return an observable of HTTP sendRequest.
     *
     * The sendRequest will be sent when the returned observable is subscribed to.
     * In order to cancel the ongoing request, just unsubscribe from it.
     *
     */
    Observable<HttpResponse> sendRequest(HttpRequest request);

    default void close() {
    }

    default void registerStatusGauges() {
    }
}
