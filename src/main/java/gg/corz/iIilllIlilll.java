package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class iIilllIlilll {
   final List<IlIIIIillIIIIi> ililIlIiIiilIlIi = new ArrayList<>();
   int IIIiIlIilIIiIlIi;
   final Set<Long> lIliIlIiiIliIlIi;
   int iIIiIlIiIlIiIlIi;
   int llIiIlIiilIiIlIi;
   final Map<Long, Integer> iiIiIlIiIIliIlIi;
   final long IlilIlIillilIlIi;
   int IiIiIlIiliIiIlIi;
   double liilIlIiiiilIlIi = Double.POSITIVE_INFINITY;

   void IliIlllilIi(IlIIIIillIIIIi c) {
      this.ililIlIiIiilIlIi.add(c);
      this.liilIlIiiiilIlIi = Math.min(this.liilIlIiiiilIlIi, Math.max(0.0, c.IilliliilIIi()));
      this.IIIiIlIilIIiIlIi = Math.max(this.IIIiIlIilIIiIlIi, Math.max(0, c.lIiiIiIlilli()));
      this.iIIiIlIiIlIiIlIi = Math.max(this.iIIiIlIiIlIiIlIi, Math.max(0, c.iliIiiliiiii()));
      this.llIiIlIiilIiIlIi = this.llIiIlIiilIiIlIi + Math.max(0, c.IIIllIIliIIl());
      this.iiIiIlIiIIliIlIi.merge(c.IIlllIlliIll(), 1, Integer::sum);
      if (c.Illlllllilll()) {
         this.IiIiIlIiliIiIlIi++;
      } else {
         this.lIliIlIiiIliIlIi.add(c.IIlllIlliIll());
      }
   }

   iIilllIlilll(long stand) {
      this.iiIiIlIiIIliIlIi = new LinkedHashMap<>();
      this.lIliIlIiiIliIlIi = new LinkedHashSet<>();
      this.IlilIlIillilIlIi = stand;
   }
}
