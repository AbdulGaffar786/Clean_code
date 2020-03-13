package home_task4;

public class HouseConstructionCost {
	
	public int cost_per_square_feet(String material,int area,char automated )
	{
		int cost=0;
		if(automated == 'Y' || automated == 'y')
		{
			if(material == "standard" )
			{
				cost=area*1900;
			}
			else if(material == "above")
			{
				cost=area*2200;
			}
			else if(material == "high")
			{
				cost=area*2500;
			}
		}
		else if(automated=='N'||automated=='n')
		{
			if(material == "standard")
			{
				cost=area*1200;
			}
			else if(material == "above")
			{
				cost=area*1500;
			}
			else if(material == "high")
			{
				cost=area*1800;
			}
		}
		if(cost!=0)
			return cost;
		else
			return 0;
	}
}
