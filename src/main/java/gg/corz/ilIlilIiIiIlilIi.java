package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

final class ilIlilIiIiIlilIi {
   final long llillllIIi;
   int iiillllIIi;
   final int ilillllIIi;
   final List<IiiiIiIlliiiIiIl> liillllIIi = new ArrayList<>();
   final int IiillllIIi;

   Entry<String, Integer> IilliliilIIi() {
      HashMap var1 = new HashMap();

      for (IiiiIiIlliiiIiIl var3 : this.liillllIIi) {
         for (Entry var5 : var3.lIIIiliIll.lIiiIiIlilli().entrySet()) {
            var1.merge((String)var5.getKey(), (Integer)var5.getValue(), Integer::sum);
         }
      }

      Entry var6 = null;

      for (Entry var8 : var1.entrySet()) {
         if (var6 == null || (Integer)var8.getValue() > (Integer)var6.getValue()) {
            var6 = var8;
         }
      }

      return var6;
   }

   double liiiIIllIl() {
      double var1 = 0.0;

      for (IiiiIiIlliiiIiIl var4 : this.liillllIIi) {
         var1 += var4.iIlIlllllill();
      }

      return var1 / (double)this.liillllIIi.size();
   }

   double IliIlllilIi() {
      double var1 = 0.0;

      for (IiiiIiIlliiiIiIl var4 : this.liillllIIi) {
         var1 += var4.IliIlllilIi();
      }

      return var1 / (double)this.liillllIIi.size();
   }

   ilIlilIiIiIlilIi(int cx, int cz) {
      this.ilillllIIi = cx;
      this.IiillllIIi = cz;
      this.llillllIIi = iilIIIllIIiIIIll.iIlIlllllill(cx, 0, cz);
   }

   boolean iIlIlllllill() {
      for (IiiiIiIlliiiIiIl var2 : this.liillllIIi) {
         if (var2.IiIIiliIll > 0) {
            return false;
         }
      }

      return true;
   }
}
