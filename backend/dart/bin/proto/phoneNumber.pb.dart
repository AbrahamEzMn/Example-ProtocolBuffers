///
//  Generated code. Do not modify.
//  source: phoneNumber.proto
///
// ignore_for_file: non_constant_identifier_names,library_prefixes,unused_import

// ignore: UNUSED_SHOWN_NAME
import 'dart:core' show int, bool, double, String, List, Map, override;

import 'package:protobuf/protobuf.dart' as $pb;

import 'phoneType.pbenum.dart' as $0;

class PhoneNumber extends $pb.GeneratedMessage {
  static final $pb.BuilderInfo _i = new $pb.BuilderInfo('PhoneNumber', package: const $pb.PackageName('messages'))
    ..aOS(1, 'number')
    ..e<$0.PhoneType>(2, 'type', $pb.PbFieldType.OE, $0.PhoneType.MOBILE, $0.PhoneType.valueOf, $0.PhoneType.values)
    ..hasRequiredFields = false
  ;

  PhoneNumber() : super();
  PhoneNumber.fromBuffer(List<int> i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) : super.fromBuffer(i, r);
  PhoneNumber.fromJson(String i, [$pb.ExtensionRegistry r = $pb.ExtensionRegistry.EMPTY]) : super.fromJson(i, r);
  PhoneNumber clone() => new PhoneNumber()..mergeFromMessage(this);
  PhoneNumber copyWith(void Function(PhoneNumber) updates) => super.copyWith((message) => updates(message as PhoneNumber));
  $pb.BuilderInfo get info_ => _i;
  static PhoneNumber create() => new PhoneNumber();
  PhoneNumber createEmptyInstance() => create();
  static $pb.PbList<PhoneNumber> createRepeated() => new $pb.PbList<PhoneNumber>();
  static PhoneNumber getDefault() => _defaultInstance ??= create()..freeze();
  static PhoneNumber _defaultInstance;
  static void $checkItem(PhoneNumber v) {
    if (v is! PhoneNumber) $pb.checkItemFailed(v, _i.qualifiedMessageName);
  }

  String get number => $_getS(0, '');
  set number(String v) { $_setString(0, v); }
  bool hasNumber() => $_has(0);
  void clearNumber() => clearField(1);

  $0.PhoneType get type => $_getN(1);
  set type($0.PhoneType v) { setField(2, v); }
  bool hasType() => $_has(1);
  void clearType() => clearField(2);
}

