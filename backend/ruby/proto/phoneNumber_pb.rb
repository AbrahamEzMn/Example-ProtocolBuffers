# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: phoneNumber.proto

require 'google/protobuf'

require './proto/phoneType_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "messages.PhoneNumber" do
    optional :number, :string, 1
    optional :type, :enum, 2, "messages.PhoneType"
  end
end

module Messages
  PhoneNumber = Google::Protobuf::DescriptorPool.generated_pool.lookup("messages.PhoneNumber").msgclass
end
