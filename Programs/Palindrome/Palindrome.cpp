#include <string>
#include <fstream>
using namespace std;

int main(){
	ifstream infile;
	ofstream outfile;
	infile.open("test.txt");
	outfile.open("testout.txt");
	const int SIZE = 150;
	char fwd[SIZE] = { 0 };
	char bwd[SIZE] = { 0 };
	string str;

	while (getline(infile, str)){
		outfile << str << "   ";
		int j = 0;
		int r = 0;
		bool pal = true;

		for (int i = 0; str[i]; i++){
			str[i] = tolower(str[i]);
		}
		for (int i = 0; str[i]; i++){
			if (isalpha(str[i])){
				fwd[j] = str[i];
				j++;
			}
		}
		for (int i = SIZE - 1; i >= 0; i--){
			if (fwd[i]){
				bwd[r] = fwd[i];
				r++;
			}
		}

		for (int i = 0; fwd[i]; i++){
			if ((fwd[i]) != (bwd[i])){
				pal = false;
				break;
			}
		}

		if (pal)
			outfile << "This is a palindrome!" << endl;
		else
			outfile << "This is not a palindrome!" << endl;
		
		std::fill_n(fwd, SIZE, 0);
		std::fill_n(bwd, SIZE, 0);

	}

	infile.close();
	outfile.close();
	return 0;
}
