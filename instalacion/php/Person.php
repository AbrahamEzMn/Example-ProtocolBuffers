<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: person.proto

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>Person</code>
 */
class Person extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * Generated from protobuf field <code>int32 id = 2;</code>
     */
    private $id = 0;
    /**
     * Generated from protobuf field <code>string email = 3;</code>
     */
    private $email = '';
    /**
     * Generated from protobuf field <code>repeated .Person.PhoneNumber phone = 4;</code>
     */
    private $phone;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *     @type int $id
     *     @type string $email
     *     @type \Person\PhoneNumber[]|\Google\Protobuf\Internal\RepeatedField $phone
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Person::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>int32 id = 2;</code>
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Generated from protobuf field <code>int32 id = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkInt32($var);
        $this->id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string email = 3;</code>
     * @return string
     */
    public function getEmail()
    {
        return $this->email;
    }

    /**
     * Generated from protobuf field <code>string email = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setEmail($var)
    {
        GPBUtil::checkString($var, True);
        $this->email = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .Person.PhoneNumber phone = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPhone()
    {
        return $this->phone;
    }

    /**
     * Generated from protobuf field <code>repeated .Person.PhoneNumber phone = 4;</code>
     * @param \Person\PhoneNumber[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPhone($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Person\PhoneNumber::class);
        $this->phone = $arr;

        return $this;
    }

}

