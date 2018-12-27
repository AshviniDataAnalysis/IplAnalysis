package com.statistics.compute;

import java.util.Map;

import com.statistics.dataprepare.DataPrepHelper;
import com.statistics.function.Match;


public class IPLStatisticsManger {

	public static void main(String[] args) {
		
		DataPrepHelper dataPrepHelper = new DataPrepHelper();

		Map<String, Match> matches = dataPrepHelper.getDataFromFiles();

		
		
		System.out.println(matches.size());
		
		IPLStatisticsComputer computer = new IPLStatisticsComputer();
		
	    computer.getTopTeamsOf1617ByField(matches);
	   
		
		//dataPrepHelper.getAggregatedData(matches);
		
		
		System.out.println("*************************************");
		computer.getBoundariesSummary(matches);
	}
}
