package gg.corz;

import java.util.HashMap;

public final class Iliiiilllliiiill {
   private String liIiiiiill;
   private final HashMap<Long, long[]> IiIiiiiill = new HashMap<>();

   public boolean lIiiIiIlilli(long actionKey, long progressToken) {
      long[] var5 = this.IiIiiiiill.get(actionKey);
      return var5 != null && var5[0] == progressToken;
   }

   public static long IliIlllilIi(int op, long count, long stand, int cell) {
      long var6 = 1469598103934665603L;
      var6 = (var6 ^ (long)op) * 1099511628211L;
      var6 = (var6 ^ count) * 1099511628211L;
      var6 = (var6 ^ stand) * 1099511628211L;
      var6 = (var6 ^ (long)cell) * 1099511628211L;
      return var6 == 0L ? 1L : var6;
   }

   public String iliIiiliiiii() {
      return this.liIiiiiill;
   }

   public void IIIllIIliIIl() {
      this.IiIiiiiill.clear();
      this.liIiiiiill = "";
   }

   public int IilliliilIIi(long actionKey) {
      long[] var3 = this.IiIiiiiill.get(actionKey);
      return var3 == null ? 0 : (int)var3[1];
   }

   public Iliiiilllliiiill() {
      this.liIiiiiill = "";
   }

   public boolean iIlIlllllill(long progressToken, long firstActionKey) {
      long[] var5 = this.IiIiiiiill.get(progressToken);
      if (var5 != null && var5[0] == firstActionKey) {
         var5[1]++;
         return true;
      } else {
         return false;
      }
   }

   public void liiiIIllIl(long actionKey, long failureClass, String progressToken) {
      this.liIiiiiill = progressToken == null ? "" : progressToken;
      this.IiIiiiiill.put(actionKey, new long[]{failureClass, 0L});
   }
}
