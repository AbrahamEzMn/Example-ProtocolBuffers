<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: phoneNumber.proto

namespace GPBMetadata;

class PhoneNumber
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\PhoneType::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0a670a1170686f6e654e756d6265722e70726f746f12086d657373616765" .
            "7322400a0b50686f6e654e756d626572120e0a066e756d62657218012001" .
            "280912210a047479706518022001280e32132e6d657373616765732e5068" .
            "6f6e6554797065620670726f746f33"
        ));

        static::$is_initialized = true;
    }
}
