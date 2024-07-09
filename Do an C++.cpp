#include<iostream>
#include<iomanip>
#include<cstring>
#include<algorithm>
#include<cmath>

int dem = 0;
using namespace std;

struct QlySVxemCaNhac
{
    char msv[10];
    string hoten;
    char gioi[5];
    char sdt[10];
    string lop;

    void Nhap()
    {
    	do
    	{
      	cout << "Nhap ma sinh vien: ";
     		cin >> msv;
               if (strlen(msv) != 10)
        		cout << "Ma sinh vien khong hop le. Hay nhap lai!!!" << endl;
	}
	while(strlen(msv) != 10);
	cin.ignore();
              cout << "Nhap ho va ten sinh vien: ";
              getline(cin, hoten);
              cout << "Nhap gioi tinh cua sinh vien: ";
              cin >> gioi;
              cout << "Nhap ten lop cua sinh vien: ";
             cin >> lop;
             do
             {
        	  	 cout << "Nhap so dien thoai cua sinh vien: ";
                    cin >> sdt;
                      cout << "\n";
                      if (sdt[0] != '0' || strlen(sdt) != 10)
                      	cout << "So dien thoai khong hop le \n";
	         }
				while(sdt[0] != '0' || strlen(sdt) != 10);
	        }

	void Xuat()
	{
		cout << setw(2) << ++dem << " " << setw(13) << msv << " " << setw(22) << hoten << setw(15) << gioi << setw(22) << sdt << setw(14) << lop << endl;
	}
};

typedef QlySVxemCaNhac SV;

void NhapSL(int &n)
{
    do
    {
        	cout << "Nhap so luong sinh vien: ";
        	cin >> n;
        	if (n < 0)
            		cout << "Moi ban nhap lai!!! " << endl;
     }
	 while (n < 0);
}

void NhapSV(SV *sv, int n)
{
    	for (int i = 0; i < n; i++)
    	{
        	       int res = 0;
        	       do
        	       {
            		res = 0;
            		cout << "- Nhap thong tin sinh vien thu " << i + 1 << ": " << endl;
            		sv[i].Nhap();
            		for (int j = 0; j < i; j++)
            		{
                		if (strcmp(sv[j].msv, sv[i].msv) == 0)
               		{
                    			cout << "Ma sinh vien da ton tai. Moi ban nhap lai!!!" << endl;
                    			res++;
                    			break;
                		}
            		}
       	         }
	while (res != 0);
 	}
}

void TieuDe()
{
  	cout << setw(2) << "STT" << setw(10) << "MSV" << setw(22) << "Ho Ten" << setw(20) << "Gioi tinh" << setw(22) << "So dien thoai" << setw(11) << "Lop" << endl;
}

void XuatSV(SV *sv , int n)
{
	dem = 0;
	TieuDe();
	for(int i = 0; i < n; i++)
	{
		sv[i].Xuat();
	}
}

void ThemSV(SV *sv , int &n)
{
  n++;
  int res = 0;
  do
  {
  	res = 0;
  	cout << "Nhap thong tin sinh vien can them: " << endl;
  	sv[n-1].Nhap();
  	for(int i = 0; i < n - 1; i++)
  	{
  		if(sv[i].msv == sv[n-1].msv)
  		{
     			cout << "Ma sinh vien da ton tai. Moi ban nhap lai!!! " << endl;
  				res++;
		      break;
  	 	}
  	}
   }
	while(res != 0);
}

void XoaSV(SV *sv , int &n)
{
char xoasv[10];
	cout << "Nhap ma sinh vien ban can xoa: ";
	cin >> xoasv;
	int i = 0;
	while (i < n)
	{
		if(strcmp(sv[i].msv, xoasv) == 0)
		{
			for(int j = i; j < n - 1; j++)
			{
				sv[j] = sv[j + 1];
			}
			n--;
			cout << "- Da xoa thong tin sinh vien co ma sinh vien: " << xoasv << endl;
			return;
		}
		i++;
	}
		cout << "Ma sinh vien nay khong ton tai \n";
}

void SuaSV(SV *sv, int n)
{
	char suasv[10];
	cout << "Nhap ma sinh vien cua sinh vien can chinh: ";
	cin >> suasv;
  	for(int i = 0; i < n; i++)
	{
		if(strcmp(sv[i].msv, suasv) == 0)
		{
			cout << "- Nhap lai thong tin cho sinh vien co ma sinh vien: " << suasv << endl;
		   sv[i].Nhap();
		  	 cout << "- Thong tin cua sinh vien can sua da cap nhat thanh cong!!! " << endl;
		  	 return;
		}
	}
	cout << "Ma sinh vien nay khong ton tai \n";
}

void Timkiem(SV *sv, int n)
{
    	char timsv[10], res = 0;
   		cout << "Nhap ma sinh vien cua sinh vien can tim kiem: ";
	 	cin >> timsv;
    	for(int i = 0; i < n; i++)
    	{
        		if(strcmp(sv[i].msv, timsv) == 0)
        		{
            			sv[i].Xuat();
            			res++;
        		}
    	}
    	if(res == 0)
      cout << "Ma sinh vien nay khong ton tai!!!" << endl;
}

void SapxepTen(SV *sv,int n)
{
	cout << "Danh sach sinh vien sap xep theo Alphabet: "<< endl;
	for(int i = 0; i < n - 1; i++)
	{
		for(int j = i + 1; j < n; j++)
		{
		   	if(sv[i].hoten > sv[j].hoten)
		  	{
              	swap(sv[i], sv[j]);
		  	}
		}
	}
   	 XuatSV(sv, n);
}

void Quatang(SV *sv, int n)
{
    	char quasv[3];
    	cout << "Nhap ma sinh vien: ";
    	cin >> quasv;
    	if (strncmp(quasv, "28", 2) == 0)
    	{
        		cout << "Chuc mung ban da nhan duoc qua tang moc khoa logo truong va 1 chai nuoc giai khat!" << endl;
    	}
    	else
    	{
        		cout << "Chuc mung ban da nhan duoc 1 chai nuoc giai khat!" << endl;
    	}
    	cout << "Hen gap ban tai dem xem ca nhac!!! " << endl;
}

void Giaxem(SV *sv, int n)
{
	cout << "Gia ve niem yet: 150000 " << endl;
	char cost_msv[3];
	cout << "Nhap ma sinh vien de xem uu dai: ";
	cin >> cost_msv;
	float SauUuDai;
	if (strncmp(cost_msv, "28", 2) == 0)
	{
		SauUuDai = 150000 * 0.85;
	}
	else if (strncmp(cost_msv, "27", 2) == 0)
	{
		SauUuDai = 150000 * 0.9;
	}
	else
	{
		SauUuDai = 150000 * 0.95;
	}
	cout << "Gia ve sau uu dai: " << SauUuDai << endl;
}

void Press()
{
    system("pause");
    system("cls");
}

void Menu()
{
	cout << "===================================================================== \n";
	cout << "\t oOo CHUONG TRINH QUAN LY SINH VIEN XEM CA NHAC oOo "<< "\n";
	cout << "===================================================================== \n";
	cout << "  1. Nhap thong tin sinh vien \n";
	cout << "  2. Hien thi thong tin sinh vien \n";
	cout << "  3. Them thong tin sinh vien xem ca nhac \n";
	cout << "  4. Xoa thong tin sinh vien xem ca nhac \n";
	cout << "  5. Chinh sua thong tin sinh vien xem ca nhac \n";
	cout << "  6. Tim sinh vien bang ma sinh vien \n";
	cout << "  7. Sap xep danh sach sinh vien theo bang Alphabet \n";
	cout << "  8. Qua tang sinh vien \n";
	cout << "  9. Gia ve xem ca nhac \n";
	cout << "  0. Thoat chuong trinh" << endl;
}

int main()
{
    int n = 0;
    char chon;
    int luachon;
    SV *sv;
    sv = new SV[100];
    do
    {
        Menu();
        cout << "Moi ban nhap lua chon: ";
		  cin >> luachon;

	   switch (luachon)
        {
            case 1:
            	system("cls");
                NhapSL(n);
                NhapSV(sv, n);
                Press();
                break;
            case 2:
            	system("cls");
                XuatSV(sv, n);
                Press();
                break;
            case 3:
            	system("cls");
	 			ThemSV(sv, n);
                Press();
                break;
            case 4:
            	system("cls");
	 			XoaSV(sv, n);
                Press();
                break;
            case 5:
            	system("cls");
 	 			SuaSV(sv, n);
	   			Press();
 				break;
            case 6:
            	system("cls");
 				Timkiem(sv, n);
                Press();
                break;
            case 7:
            	system("cls");
	   			SapxepTen(sv, n);
                Press();
                break;
            case 8:
				system("cls");
	 			Quatang(sv, n);
	 			Press();
            	break;
            case 9:
            	system("cls");
	 			Giaxem(sv, n);
	   			Press();
            	break;
            case 0:
            	cout << "Ban dang thoat chuong trinh? " << endl;
            	 break;
        default:
            cout << "Lua chon khong ton tai!!!" << endl;
            Press();
            break;
        }
        cout << "Ban co muon lua chon tiep khong (1/0): ";
        cin >> chon;
        system("cls");
        if (chon == '0')
            cout << "Tam biet hen gap ban tai dem xem ca nhac!!!  \n";
    }
	 while (chon =='1');
    delete[] sv;
    return 0;
}


