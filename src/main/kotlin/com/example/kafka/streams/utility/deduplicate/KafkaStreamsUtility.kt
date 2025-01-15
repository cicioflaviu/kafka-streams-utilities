package com.example.kafka.streams.utility.deduplicate

import org.apache.kafka.common.serialization.Serde
import org.apache.kafka.common.serialization.Serializer
import org.apache.kafka.streams.kstream.KStream

fun <K, V> KStream<K, V>.deduplicate(
    duplicationStoreName: String,
    keySerde: Serde<K>,
    valueSerializer: Serializer<V>
): KStream<K, V> {
    return this
}