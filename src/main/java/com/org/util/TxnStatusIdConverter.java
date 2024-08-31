package com.org.util;

import org.modelmapper.AbstractConverter;

import com.org.constant.TransactionStausEnum;

public class TxnStatusIdConverter extends AbstractConverter<Integer, String>{

	@Override
	protected String convert(Integer source) {
		return TransactionStausEnum.getById(source).getName();
	}
	

}
