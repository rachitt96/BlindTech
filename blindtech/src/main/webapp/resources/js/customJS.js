function validate()
{
	var a=document.getElementById("fn");
	var b=document.getElementById("mn");
	var c=document.getElementById("ln");
	var d=document.getElementById("mobile");
	var mob = /^[1-9]{1}[0-9]{9}$/;
	
	if(a.value == "")
	{
		a.focus();
		return false;
	}
	
	else if(b.value == "")
	{
		b.focus();
		return false;
	}
	
	else if(c.value == "")
	{
		c.focus();
		return false;
	}
	
	else if(mob.test(d.value) == false)
	{
			d.focus();
			return false;
	}
}