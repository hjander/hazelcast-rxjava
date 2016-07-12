/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.rxjava;

import com.hazelcast.core.IMap;
import com.hazelcast.map.EntryProcessor;
import rx.Observable;

import java.util.concurrent.TimeUnit;

public interface RxIMap<K, V> {

    Observable<V> get(K key);

    Observable<V> put(K key, V value);

    Observable<V> put(K key, V value, long ttl, TimeUnit timeout);

    Observable<Void> set(K key, V value);

    Observable<Void> set(K key, V value, long ttl, TimeUnit timeout);

    Observable<V> remove(K key);

    <T> Observable<T> submitToKey(K key, EntryProcessor<K, V> entryProcessor);

    IMap<K, V> getDelegate();

}
