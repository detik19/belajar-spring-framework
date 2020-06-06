package com.subrutin.abcbank.service;

import java.math.BigDecimal;

public interface TransferService {

	public Boolean ownAccountTransfer(String sourceAccount, String destinationAccount, BigDecimal amount);

}
