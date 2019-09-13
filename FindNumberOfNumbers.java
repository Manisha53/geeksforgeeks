//---------------------------------------my code--------------------
class GfG {
public static int num(int a[], int n, int k) {
int digits = 0;
for (int i = 0; i < n; i++) {
int div = a[i];
while (div >= 10) {
int mod = div % 10;

if (mod == k) {
digits++;
}
div = div / 10;
}
if (div == k) {
digits++;
}
}
return digits;
}
}
