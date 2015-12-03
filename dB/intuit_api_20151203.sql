-- MySQL dump 10.13  Distrib 5.6.19, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: intuit_api
-- ------------------------------------------------------
-- Server version	5.6.19-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ACCOUNT`
--

DROP TABLE IF EXISTS `ACCOUNT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ACCOUNT` (
  `id` bigint(20) NOT NULL,
  `status` varchar(10) NOT NULL,
  `accountNumber` varchar(50) NOT NULL,
  `accountNumberReal` varchar(50) DEFAULT NULL,
  `accountNickname` varchar(100) DEFAULT NULL,
  `displayPosition` int(20) DEFAULT NULL,
  `institutionId` bigint(20) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `registeredUserName` varchar(50) DEFAULT NULL,
  `balanceAmount` varchar(50) DEFAULT NULL,
  `balanceDate` int(20) DEFAULT NULL,
  `balancePreviousAmount` varchar(50) DEFAULT NULL,
  `lastTxnDate` int(20) DEFAULT NULL,
  `aggrSuccessDate` int(20) DEFAULT NULL,
  `aggrAttemptDate` int(20) DEFAULT NULL,
  `aggrStatusCode` varchar(10) DEFAULT NULL,
  `currencyCode` varchar(20) DEFAULT NULL,
  `bankId` int(11) DEFAULT NULL,
  `institutionLoginId` int(11) DEFAULT NULL,
  `creditAccountType` varchar(30) DEFAULT NULL,
  `detailedDescription` varchar(200) DEFAULT NULL,
  `interestRate` varchar(10) DEFAULT NULL,
  `creditAvailableAmount` varchar(50) DEFAULT NULL,
  `creditMaxAmount` varchar(50) DEFAULT NULL,
  `cashAdvanceAvailableAmount` varchar(50) DEFAULT NULL,
  `cashAdvanceMaxAmount` varchar(50) DEFAULT NULL,
  `cashAdvanceBalance` varchar(50) DEFAULT NULL,
  `cashAdvanceInterestRate` varchar(10) DEFAULT NULL,
  `currentBalance` varchar(50) DEFAULT NULL,
  `paymentMinAmount` varchar(50) DEFAULT NULL,
  `paymentDueDate` int(20) DEFAULT NULL,
  `previousBalance` varchar(50) DEFAULT NULL,
  `statementEndDate` int(20) DEFAULT NULL,
  `statementPurchaseAmount` varchar(50) DEFAULT NULL,
  `statementFinanceAmount` varchar(50) DEFAULT NULL,
  `pastDueAmount` varchar(50) DEFAULT NULL,
  `lastPaymentAmount` varchar(50) DEFAULT NULL,
  `lastPaymentDate` int(20) DEFAULT NULL,
  `statementCloseBalance` varchar(50) DEFAULT NULL,
  `statementLateFeeAmount` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ACCOUNT`
--

LOCK TABLES `ACCOUNT` WRITE;
/*!40000 ALTER TABLE `ACCOUNT` DISABLE KEYS */;
INSERT INTO `ACCOUNT` VALUES (400165094462,'ACTIVE','8000006666',NULL,NULL,0,100000,NULL,NULL,NULL,0,NULL,0,0,0,NULL,NULL,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL);
/*!40000 ALTER TABLE `ACCOUNT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `BANKING_TRANSACTION`
--

DROP TABLE IF EXISTS `BANKING_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `BANKING_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BANKING_TRANSACTION`
--

LOCK TABLES `BANKING_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `BANKING_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `BANKING_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CREDIT_CARD_TRANSACTION`
--

DROP TABLE IF EXISTS `CREDIT_CARD_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CREDIT_CARD_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CREDIT_CARD_TRANSACTION`
--

LOCK TABLES `CREDIT_CARD_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `CREDIT_CARD_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `CREDIT_CARD_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INSTITUTION`
--

DROP TABLE IF EXISTS `INSTITUTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INSTITUTION` (
  `id` bigint(20) NOT NULL,
  `institutionName` varchar(50) DEFAULT NULL,
  `homeUrl` varchar(50) DEFAULT NULL,
  `phoneNumber` varchar(50) DEFAULT NULL,
  `virtual` char(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INSTITUTION`
--

LOCK TABLES `INSTITUTION` WRITE;
/*!40000 ALTER TABLE `INSTITUTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `INSTITUTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INVESTMENT_BANKING_TRANSACTION`
--

DROP TABLE IF EXISTS `INVESTMENT_BANKING_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INVESTMENT_BANKING_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  `bankingTransactionType` varchar(10) DEFAULT NULL,
  `subaccountFundType` varchar(50) DEFAULT NULL,
  `banking401KSourceType` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INVESTMENT_BANKING_TRANSACTION`
--

LOCK TABLES `INVESTMENT_BANKING_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `INVESTMENT_BANKING_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `INVESTMENT_BANKING_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INVESTMENT_POSITION`
--

DROP TABLE IF EXISTS `INVESTMENT_POSITION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INVESTMENT_POSITION` (
  `id` bigint(20) NOT NULL,
  `changePercent` float(7,4) DEFAULT NULL,
  `costBasis` float(7,4) DEFAULT NULL,
  `currencyCode` varchar(20) DEFAULT NULL,
  `currencyRate` float(7,4) DEFAULT NULL,
  `currencyType` varchar(20) DEFAULT NULL,
  `unitPrice` float(7,4) DEFAULT NULL,
  `priceAsOfDate` datetime DEFAULT NULL,
  `cusip` varchar(20) DEFAULT NULL,
  `dailyChange` float(7,4) DEFAULT NULL,
  `memo` varchar(20) DEFAULT NULL,
  `empPretaxContribAmount` float(7,4) DEFAULT NULL,
  `empMatchAmount` float(7,4) DEFAULT NULL,
  `heldInAccount` varchar(20) DEFAULT NULL,
  `holdType` varchar(20) DEFAULT NULL,
  `investmentAllocation` varchar(20) DEFAULT NULL,
  `investmentDirection` varchar(20) DEFAULT NULL,
  `paidPrice` float(7,4) DEFAULT NULL,
  `marketValue` float(7,4) DEFAULT NULL,
  `maturityValue` float(7,4) DEFAULT NULL,
  `units` float(7,4) DEFAULT NULL,
  `unitUserQuantity` float(7,4) DEFAULT NULL,
  `unitStreetQuantity` float(7,4) DEFAULT NULL,
  `positionType` varchar(20) DEFAULT NULL,
  `positionStatus` varchar(20) DEFAULT NULL,
  `secured` varchar(20) DEFAULT NULL,
  `inv401KSource` varchar(20) DEFAULT NULL,
  `reinvestmentCapGains` char(3) DEFAULT NULL,
  `reinvestmentDividend` char(3) DEFAULT NULL,
  `transactionType` varchar(20) DEFAULT NULL,
  `invSecurityType` varchar(20) DEFAULT NULL,
  `otherInfo` varchar(20) DEFAULT NULL,
  `optionInfo` varchar(20) DEFAULT NULL,
  `stockInfo` varchar(20) DEFAULT NULL,
  `mfInfo` varchar(20) DEFAULT NULL,
  `debtInfo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INVESTMENT_POSITION`
--

LOCK TABLES `INVESTMENT_POSITION` WRITE;
/*!40000 ALTER TABLE `INVESTMENT_POSITION` DISABLE KEYS */;
/*!40000 ALTER TABLE `INVESTMENT_POSITION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INVESTMENT_TRANSACTION`
--

DROP TABLE IF EXISTS `INVESTMENT_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INVESTMENT_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  `reversalInstitutionTransactionId` varchar(20) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `buyType` varchar(10) DEFAULT NULL,
  `incomeType` varchar(10) DEFAULT NULL,
  `inv401KSource` varchar(50) DEFAULT NULL,
  `loanId` varchar(20) DEFAULT NULL,
  `optionsActionType` varchar(20) DEFAULT NULL,
  `optionsBuyType` varchar(20) DEFAULT NULL,
  `optionsSellType` varchar(20) DEFAULT NULL,
  `positionType` varchar(20) DEFAULT NULL,
  `relatedInstitutionTradeId` varchar(20) DEFAULT NULL,
  `relatedOptionTransType` varchar(20) DEFAULT NULL,
  `securedType` varchar(20) DEFAULT NULL,
  `sellReason` varchar(50) DEFAULT NULL,
  `sellType` varchar(20) DEFAULT NULL,
  `subaccountFromType` varchar(20) DEFAULT NULL,
  `subaccountFundType` varchar(20) DEFAULT NULL,
  `subaccountSecurityType` varchar(20) DEFAULT NULL,
  `subaccountToType` varchar(20) DEFAULT NULL,
  `transferAction` varchar(20) DEFAULT NULL,
  `unitType` varchar(20) DEFAULT NULL,
  `cusip` varchar(20) DEFAULT NULL,
  `symbol` varchar(20) DEFAULT NULL,
  `unitAction` varchar(20) DEFAULT NULL,
  `optionsSecurity` varchar(20) DEFAULT NULL,
  `tradeDate` datetime DEFAULT NULL,
  `settleDate` datetime DEFAULT NULL,
  `accruedInterestAmount` float(7,4) DEFAULT NULL,
  `averageCostBasisAmount` float(7,4) DEFAULT NULL,
  `commissionAmount` float(7,4) DEFAULT NULL,
  `denominator` float(7,4) DEFAULT NULL,
  `payrollDate` datetime DEFAULT NULL,
  `purchaseDate` datetime DEFAULT NULL,
  `gainAmount` float(7,4) DEFAULT NULL,
  `feesAmount` float(7,4) DEFAULT NULL,
  `fractionalUnitsCashAmount` float(7,4) DEFAULT NULL,
  `loadAmount` float(7,4) DEFAULT NULL,
  `loanInterestAmount` float(7,4) DEFAULT NULL,
  `loanPrincipalAmount` float(7,4) DEFAULT NULL,
  `markdownAmount` float(7,4) DEFAULT NULL,
  `markupAmount` float(7,4) DEFAULT NULL,
  `newUnits` float(7,4) DEFAULT NULL,
  `numerator` float(7,4) DEFAULT NULL,
  `oldUnits` float(7,4) DEFAULT NULL,
  `penaltyAmount` float(7,4) DEFAULT NULL,
  `priorYearContribution` char(3) DEFAULT NULL,
  `sharesPerContract` int(10) DEFAULT NULL,
  `stateWithholding` float(7,4) DEFAULT NULL,
  `totalAmount` float(7,4) DEFAULT NULL,
  `taxesAmount` float(7,4) DEFAULT NULL,
  `taxExempt` char(3) DEFAULT NULL,
  `unitPrice` float(7,4) DEFAULT NULL,
  `units` float(7,4) DEFAULT NULL,
  `withholdingAmount` float(7,4) DEFAULT NULL,
  `optionsSharesPerContract` bigint(20) DEFAULT NULL,
  `invSecurityType` varchar(20) DEFAULT NULL,
  `otherInfo` varchar(50) DEFAULT NULL,
  `optionInfo` varchar(50) DEFAULT NULL,
  `stockInfo` varchar(50) DEFAULT NULL,
  `mfInfo` varchar(50) DEFAULT NULL,
  `debtInfo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INVESTMENT_TRANSACTION`
--

LOCK TABLES `INVESTMENT_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `INVESTMENT_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `INVESTMENT_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LOAN_TRANSACTION`
--

DROP TABLE IF EXISTS `LOAN_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LOAN_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  `principalAmount` float(7,4) DEFAULT NULL,
  `interestAmount` float(7,4) DEFAULT NULL,
  `escrowTotalAmount` float(7,4) DEFAULT NULL,
  `escrowTaxAmount` float(7,4) DEFAULT NULL,
  `escrowInsuranceAmount` float(7,4) DEFAULT NULL,
  `escrowPmiAmount` float(7,4) DEFAULT NULL,
  `escrowFeesAmount` float(7,4) DEFAULT NULL,
  `escrowOtherAmount` float(7,4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LOAN_TRANSACTION`
--

LOCK TABLES `LOAN_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `LOAN_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `LOAN_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `REWARDS_TRANSACTION`
--

DROP TABLE IF EXISTS `REWARDS_TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `REWARDS_TRANSACTION` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `REWARDS_TRANSACTION`
--

LOCK TABLES `REWARDS_TRANSACTION` WRITE;
/*!40000 ALTER TABLE `REWARDS_TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `REWARDS_TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TRANSACTION`
--

DROP TABLE IF EXISTS `TRANSACTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TRANSACTION` (
  `id` bigint(20) NOT NULL,
  `currencyType` varchar(10) DEFAULT NULL,
  `institutionTransactionId` varchar(20) DEFAULT NULL,
  `transactionCorrectedType` varchar(10) DEFAULT NULL,
  `serverTransactionId` varchar(20) DEFAULT NULL,
  `checkNumber` varchar(20) DEFAULT NULL,
  `refNumber` varchar(20) DEFAULT NULL,
  `confirmationNumber` varchar(20) DEFAULT NULL,
  `payeeId` varchar(20) DEFAULT NULL,
  `payeeName` varchar(50) DEFAULT NULL,
  `extendedPayeeName` varchar(50) DEFAULT NULL,
  `memo` varchar(50) DEFAULT NULL,
  `type` varchar(50) DEFAULT NULL,
  `valueType` varchar(10) DEFAULT NULL,
  `currencyRate` bigint(20) DEFAULT NULL,
  `originalCurrency` char(2) DEFAULT NULL,
  `postedDate` datetime DEFAULT NULL,
  `userDate` datetime DEFAULT NULL,
  `availableDate` datetime DEFAULT NULL,
  `amount` float(7,4) DEFAULT NULL,
  `runningBalanceAmount` float(7,4) DEFAULT NULL,
  `pending` char(2) DEFAULT NULL,
  `categorization` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TRANSACTION`
--

LOCK TABLES `TRANSACTION` WRITE;
/*!40000 ALTER TABLE `TRANSACTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `TRANSACTION` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-03 15:44:38
