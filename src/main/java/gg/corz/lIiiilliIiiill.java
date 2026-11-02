package gg.corz;

public enum lIiiilliIiiill {
   IIIilllIilIIilllIi(lIiiIiIlilli<"lIiiIiIlilli","PiqGJEbBvwgnausHNj6/1MiwYY169R0Q6jg+lWGR+7milrA=">()),
   iIIilllIiIlIilllIi(lIiiIiIlilli<"lIiiIiIlilli","3qkvLabZI+PqWfT1kpdZh48KawgH2W7SEhQMvEFUAB9CJQ==">()),
   llIilllIiilIilllIi(lIiiIiIlilli<"lIiiIiIlilli","5JOPay5cSeBo83pPdLFFxwJgjOOk3RuVRjsPHU/FxA==">());

   // $VF: synthetic field
   private static final lIiiilliIiiill[] iiIilllIiIIlilllIi = IilliliilIIi();
   private final String IiIilllIiliIilllIi;

   private lIiiilliIiiill(String nullx) {
      this.IiIilllIiliIilllIi = nullx;
   }

   public String IliIlllilIi() {
      return this.IiIilllIiliIilllIi;
   }

   public static String[] liiiIIllIl() {
      long var3 = -3269987758798218924L;
      lIiiilliIiiill[] var0 = values();
      String[] var1 = new String[var0.length];

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var0.length; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = var0[(int)(var5 >>> 32)].IiIilllIiliIilllIi;
      }

      return var1;
   }

   public static lIiiilliIiiill iIlIlllllill(String label) {
      long var5 = 7545761485213455171L;
      lIiiilliIiiill[] var1 = values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIiiilliIiiill var4 = var1[(int)var8];
         if (var4.IiIilllIiliIilllIi.equalsIgnoreCase(label)) {
            return var4;
         }
      }

      return IIIilllIilIIilllIi;
   }
}
