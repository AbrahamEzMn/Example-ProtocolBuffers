# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: person.proto

require 'google/protobuf'

require './proto/phoneNumber_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "messages.Person" do
    optional :name, :string, 1
    optional :id, :int32, 2
    optional :email, :string, 3
    repeated :phone, :message, 4, "messages.PhoneNumber"
  end
end

module Messages
  Person = Google::Protobuf::DescriptorPool.generated_pool.lookup("messages.Person").msgclass
end
