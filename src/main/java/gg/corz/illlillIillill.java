package gg.corz;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class illlillIillill {
   private final LinkedHashMap<iIlillIiIllillIi, Integer> lIIilIlIiiIIilIlIi = new LinkedHashMap<>();
   private iIlillIiIllillIi IlIilIlIillIilIlIi;

   public int iliIiiliiiii() {
      return this.lIIilIlIiiIIilIlIi.size();
   }

   public Map<iIlillIiIllillIi, Integer> IIIllIIliIIl() {
      return this.lIIilIlIiiIIilIlIi;
   }

   public iIlillIiIllillIi IlIlllIlilIl() {
      return this.IlIilIlIillIilIlIi;
   }

   public static Iliiiilliiii iIlIlllllill(iIlillIiIllillIi next, iIlillIiIllillIi prev) {
      if (next == null) {
         return Iliiiilliiii.illllIiIlIilllIiIl;
      } else if (next.liiiIIllIl() != prev.liiiIIllIl()) {
         return Iliiiilliiii.lilllIiIliilllIiIl;
      } else if (next.lIiiIiIlilli() != prev.lIiiIiIlilli()) {
         return Iliiiilliiii.IIillIiIllIillIiIl;
      } else if (next.IilliliilIIi() != prev.IilliliilIIi()) {
         return Iliiiilliiii.iIillIiIlIlillIiIl;
      } else if (next.iliIiiliiiii() != prev.iliIiiliiiii()) {
         return Iliiiilliiii.llillIiIlilillIiIl;
      } else if (next.iIlIlllllill() != prev.iIlIlllllill()) {
         return Iliiiilliiii.IiillIiIlliillIiIl;
      } else {
         return next.IIIllIIliIIl() != prev.IIIllIIliIIl() ? Iliiiilliiii.iiillIiIlIIIilIiIl : Iliiiilliiii.lIIilIiIliIIilIiIl;
      }
   }

   public void IiIlliIliiIl() {
      this.lIIilIlIiiIIilIlIi.clear();
      this.IlIilIlIillIilIlIi = null;
   }

   public IIiiillllIiiilll lIiiIiIlilli(List<IIIllIlilIIllIli> variableRemains, boolean options) {
      HashSet var3 = new HashSet();
      HashSet var4 = new HashSet();
      HashSet var5 = new HashSet();
      HashSet var6 = new HashSet();
      HashSet var7 = new HashSet();

      for (iIlillIiIllillIi var9 : this.lIIilIlIiiIIilIlIi.keySet()) {
         var3.add(var9.liiiIIllIl());
         var6.add(var9.lIiiIiIlilli());
         var7.add(var9.iliIiiliiiii());
         var4.add(var9.IilliliilIIi());
         var5.add(var9.iIlIlllllill());
      }

      return new IIiiillllIiiilll(
         this.lIIilIlIiiIIilIlIi.size(),
         var3.size(),
         var6.size(),
         var7.size(),
         var4.size(),
         var5.size(),
         variableRemains.size(),
         this.IilliliilIIi(variableRemains) != null,
         options
      );
   }

   public IlilIIlillilIIli IilliliilIIi(List<IIIllIlilIIllIli> options) {
      for (IIIllIlilIIllIli var3 : options) {
         if (!this.lIIilIlIiiIIilIlIi.containsKey(var3.liiiIIllIl())) {
            Iliiiilliiii var4 = iIlIlllllill(this.IlIilIlIillIilIlIi, var3.liiiIIllIl());
            if (var4 != Iliiiilliiii.lIIilIiIliIIilIiIl) {
               return new IlilIIlillilIIli(var3, var4);
            }
         }
      }

      return null;
   }

   public void liiiIIllIl(iIlillIiIllillIi tick, int c) {
      this.lIIilIlIiiIIilIlIi.put(tick, Integer.valueOf(c));
      this.IlIilIlIillIilIlIi = tick;
   }

   public boolean IliIlllilIi(iIlillIiIllillIi c) {
      return this.lIIilIlIiiIIilIlIi.containsKey(c);
   }
}
