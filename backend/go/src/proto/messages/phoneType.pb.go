// Code generated by protoc-gen-go. DO NOT EDIT.
// source: phoneType.proto

package messages

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type PhoneType int32

const (
	PhoneType_MOBILE PhoneType = 0
	PhoneType_HOME   PhoneType = 1
	PhoneType_WORK   PhoneType = 2
)

var PhoneType_name = map[int32]string{
	0: "MOBILE",
	1: "HOME",
	2: "WORK",
}

var PhoneType_value = map[string]int32{
	"MOBILE": 0,
	"HOME":   1,
	"WORK":   2,
}

func (x PhoneType) String() string {
	return proto.EnumName(PhoneType_name, int32(x))
}

func (PhoneType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_f4e47154aeb88c3e, []int{0}
}

func init() {
	proto.RegisterEnum("messages.PhoneType", PhoneType_name, PhoneType_value)
}

func init() { proto.RegisterFile("phoneType.proto", fileDescriptor_f4e47154aeb88c3e) }

var fileDescriptor_f4e47154aeb88c3e = []byte{
	// 93 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xe2, 0x2f, 0xc8, 0xc8, 0xcf,
	0x4b, 0x0d, 0xa9, 0x2c, 0x48, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2, 0xc8, 0x4d, 0x2d,
	0x2e, 0x4e, 0x4c, 0x4f, 0x2d, 0xd6, 0xd2, 0xe6, 0xe2, 0x0c, 0x80, 0x49, 0x0a, 0x71, 0x71, 0xb1,
	0xf9, 0xfa, 0x3b, 0x79, 0xfa, 0xb8, 0x0a, 0x30, 0x08, 0x71, 0x70, 0xb1, 0x78, 0xf8, 0xfb, 0xba,
	0x0a, 0x30, 0x82, 0x58, 0xe1, 0xfe, 0x41, 0xde, 0x02, 0x4c, 0x49, 0x6c, 0x60, 0xdd, 0xc6, 0x80,
	0x00, 0x00, 0x00, 0xff, 0xff, 0x7e, 0x8c, 0x1e, 0xfc, 0x50, 0x00, 0x00, 0x00,
}
