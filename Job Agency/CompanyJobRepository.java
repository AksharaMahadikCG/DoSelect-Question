package com.java;

class CompanyJobRepository {
static String getJobPrediction(int age, String highestQualification) throws NotEligibleException
{
	if(age<19)
		throw new NotEligibleException("You are underage for any job");
	else if(age>=21&&highestQualification.equals("B.E."))
	{
		return "We have openings for junior developer";
	}
	else
		if(age>=26&&(highestQualification.equals("M.S.")||highestQualification.equals("PhD")))
		{
			return "We have openings for senior developer";
		}
		else
			if(age>=19&&(!(highestQualification.equals("B.E")||highestQualification.equals("M.S")||highestQualification.equals("PhD"))))
			{
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			}
		return "Sorry we have no openings for now";
	}
}