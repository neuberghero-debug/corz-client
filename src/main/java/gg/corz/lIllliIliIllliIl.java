package gg.corz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class lIllliIliIllliIl {
   public long iiIIiiiIll;
   public long lIlIiiiIll;
   public long iIlIiiiIll;
   public long IllIiiiIll;
   public static final int IiIIiiiIll = 6;
   public long IIlIiiiIll;
   public long lllIiiiIll;
   private final Map<lliiIiIliliiIiIl, llIiiIililIiiIil> liIIiiiIll = new HashMap<>();

   public String Illlllllilll() {
      return String.format(
         Locale.ROOT,
         Iilllilliill<"Iilllilliill","6rXlEuq4+EsutB7PnrejKcIXIahmUEmAMnfOBuu4IhzUBTK31rEIiJ6SMg1Sck5eYWQbqOHT+WMh0yNehfgqXdHdE4EMZ8TujN4TiExgnGaAQXwPQqDBHdyCSo+yN4ks6JjxTxoJWNQvVeN/3O5Njvomu5Eu3XSSnmhhx91LOGUdnY66k5J5AH3RfTMTRviSZ2v0v6vBVN2tDVNbkfzbmP7/W1iH/Af9FFvyIBnTBqTG3EX5WM/oGWmeAtTbtSc3ex6Dqph9Qlm3V8R3SbDCfNYh2w9GVdLbOsrcc7a+gBXGacmETEsdov+mXTxIEJY=">(),
         this.iiIIiiiIll,
         this.IIlIiiiIll,
         this.lIlIiiiIll,
         this.iIlIiiiIll,
         this.IllIiiiIll,
         this.lllIiiiIll,
         this.IIlllIlliIll()
      );
   }

   public void lIiiIiIlilli(lliiIiIliliiIiIl why, llIiiIililIiiIil key) {
      if (this.liIIiiiIll.size() > 512) {
         this.liIIiiiIll.clear();
      }

      this.liIIiiiIll.put(why, key);
      this.lIlIiiiIll++;
   }

   public double IIlllIlliIll() {
      return this.IllIiiiIll == 0L ? (double)this.lllIiiiIll : (double)this.lllIiiiIll / (double)this.IllIiiiIll;
   }

   public llIiiIililIiiIil iliIiiliiiii(lliiIiIliliiIiIl key) {
      return this.liIIiiiIll.getOrDefault(key, llIiiIililIiiIil.iilIlilIil);
   }

   public int IlIlllIlilIl() {
      return this.liIIiiiIll.size();
   }

   public static boolean iIlIlllllill(int memberPlacements, int memberClicks, llIiiIililIiiIil consecutiveBlockedTicks, int blocker) {
      return memberPlacements == 0 && memberClicks == 0 && liiiIIllIl(consecutiveBlockedTicks) && blocker >= 6;
   }

   public boolean IIIllIIliIIl(lliiIiIliliiIiIl key) {
      return this.liIIiiiIll.containsKey(key);
   }

   public static boolean liiiIIllIl(llIiiIililIiiIil reject) {
      return reject == llIiiIililIiiIil.IIiIlilIil
         || reject == llIiiIililIiiIil.lIiIlilIil
         || reject == llIiiIililIiiIil.iliIlilIil
         || reject == llIiiIililIiiIil.IiiIlilIil
         || reject == llIiiIililIiiIil.lliIlilIil;
   }

   public static String IliIlllilIi(String ticksWithoutAction, int kind, int clicks, int placements, String geometryFingerprint, long blockingReason) {
      return String.format(
         Locale.ROOT,
         Iilllilliill<"Iilllilliill","kW0JE3xrBwLfa2HEpD/8ISZ0OJhIVEKhOwe3RTkKLpXYi/ljaD/4CJzs9PkJehsZmpBkJDSrZIVtSdZBVWh2Q9hZWnN2aKlNutgrjUpJpUmAcR7JfRwUxPu7yEUXrU9CxEjodNVeIVDORdsT2u723ixc0LaciJ8CgHA=">(),
         ticksWithoutAction,
         kind,
         clicks,
         placements,
         geometryFingerprint,
         blockingReason
      );
   }

   public void IiIlliIliiIl() {
      this.liIIiiiIll.clear();
      this.iiIIiiiIll = this.IIlIiiiIll = this.lIlIiiiIll = this.iIlIiiiIll = this.IllIiiiIll = this.lllIiiiIll = 0L;
   }

   public static boolean IilliliilIIi(int consecutiveBlockedTicks, int blocker, llIiiIililIiiIil clicks, int placements) {
      return consecutiveBlockedTicks == 0 && blocker == 0 && liiiIIllIl(clicks) && placements >= 6;
   }
}
