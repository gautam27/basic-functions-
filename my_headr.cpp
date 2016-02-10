/*  ------------------------------    header  -------------------------------------- */
#include<bits/stdc++.h>
using namespace std;
typedef long long int lli;
//typedef long int li;
typedef unsigned long long int ulli;
#define ff first
#define ss second
#define pb push_back
#define mp make_pair
#define mod 1000000007
#define test() int t; cin>>t;while(t--)

#define si(x) scanf("%d",&x)
#define slli(x) scanf("%lld",&x)
#define sli(x) scanf("%ld",&x)
#define sd(x) scanf("%d",&x)

#define pfi(x) printf("%d\n",x)
#define pfli(x) printf("%ld\n",x)
#define pflli(x) printf("%lld\n",x)

#define abs(x) ((x)>0?(x):-(x))


#define TRI(a,b,c) mp(mp(a,b),c)

#define INDEX(arr,ind) (lower_bound(all(arr),ind)-arr.begin())
#define all(x) x.begin(),x.end()
#define sz size()

#define rep(i,a,b) for(int  i=(a);i<(b);i++)
#define repl(i,a,b) for(lli  i=(a);i<(b);i++)
#define rrep(i,a,b) for(int i=(b);i>=(a);i--)
#define	foreach( gg,itit )	for( typeof(gg.begin()) itit=gg.begin();itit!=gg.end();itit++ )

typedef pair<lli,lli> PII;
typedef vector<int> VI;
typedef vector<PII> VPII;


/*  ------------------------------    header   end  -------------------------------------- */



/*---------------------------------------- storage  start ---------------------------------------*/
int dx[]={1,-1,0,0};
int dy[]={0,0,-1,1};
lli  comb[1001][1001];
int vis[1000000];
list<int> li[1000000];


 /*---------------------------------------- storage  end ---------------------------------------*/
 
 /*------------------------------------------ functions  start ------------------------------------*/
 
 lli gcd(lli a, lli b){ if(b)return gcd(b,a%b); return a;}
 
 inline void add(int &x, int y){x+=y; if(x>=mod)x-=mod; if(x<0)x+=mod;} // (a+b)%mod;
 
lli mulmod ( lli a , lli b,lli mod_val)  // (a*b)%c for large values of a and b 
{
	lli ret = 0;
	while(b)
	{
		if(b&1)
		{
			ret += a;
			if(ret >= mod_val)
				ret %= mod_val;
		}
		a = a + a;
		if(a >= mod_val) a %= mod_val;
		b >>= 1;
	}
	return ret;
}


 long long int read_int()
 {
	char r;
	bool start=false,neg=false;
	long long int ret=0;
	while(true){
		r=getchar();
		if((r-'0'<0 || r-'0'>9) && r!='-' && !start){
			continue;
		}
		if((r-'0'<0 || r-'0'>9) && r!='-' && start){
			break;
		}
		if(start)ret*=10;
		start=true;
		if(r=='-')neg=true;
		else ret+=r-'0';
	}
	if(!neg)
		return ret;
	else
		return -ret;
}

/*inline void printint( long n)
{
	if(n == 0)
	{
		putchar_unlocked('0');
		putchar_unlocked('\n');
	}
	else if(n == -1)
	{
		putchar_unlocked('-');
		putchar_unlocked('1');
		putchar_unlocked('\n');
	}
	else
	{
		char buf[11];
		buf[10] = '\n';
		int i = 9;
		while(n)
		{
			buf[i--] = n % 10 + '0';
			n /= 10;
		}
		while(buf[i] != '\n')
			putchar_unlocked(buf[++i]);
	}
}	*/
 
 
 lli combination()
  {
  
  	for(int i = 0; i < 1000; i++) {
        comb[i][0] = 1;
        for(int j = 1; j <= i; j++)
            comb[i][j] = (comb[i - 1][j] + comb[i - 1][j - 1]) % mod;
    }
  
  }
  

int dfs(int index)
{
	 stack<int> s; s.push(index);  vis[index]=1;
	 while(!s.empty())
	  {
	  	 int index=s.top(); s.pop();
	  
	  	 list<int> :: iterator it;
	  	 for(it=li[index].begin();it!=li[index].end();it++)
	  	  {
	  	  	 if(!vis[*it] )
	  	  	  {
	  	  	  	 vis[*it]=1; s.push(*it);
			  }
		}
	  }	
}
 
  /*------------------------------------------ functions  end ------------------------------------*/
 
 /*


void bfs()
{
 	
}

void lps()
{
  	
}

mst 
seg tree

 */
 /*---------------------------------------- main ------------------------------------*/



int main()
{
     //freopen("abc.txt","r",stdin);
	//freopen("pqr.txt","w",stdout);
	ios_base::sync_with_stdio(false);cin.tie(NULL);
	

	 }
