package gg.corz;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class IlIlilllIlil {
   private String lIllilliiIllilli;
   private int iiIlilliIIllilli;
   public static final int iIIlilliIlIlilli = 512;
   public static final int llIlilliilIlilli = 64;
   private final LinkedHashMap<Long, LinkedHashMap<Long, lliIIliiliIIli>> IiIlilliliIlilli = new LinkedHashMap<Long, LinkedHashMap<Long, lliIIliiliIIli>>(
      16, 0.75F, false
   ) {
      @Override
      protected boolean removeEldestEntry(Entry<Long, LinkedHashMap<Long, lliIIliiliIIli>> e) {
         return this.size() > 64;
      }
   };

   public int IIlllIlliIll() {
      return this.IiIlilliliIlilli.size();
   }

   public String Iilllilliill() {
      return this.lIllilliiIllilli;
   }

   public Set<Long> iliIiiliiiii(long component) {
      Map var3 = this.IiIlilliliIlilli.get(component);
      if (var3 == null) {
         return Set.of();
      } else {
         LinkedHashSet var4 = new LinkedHashSet();

         for (lliIIliiliIIli var6 : var3.values()) {
            if (var6.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
               var4.add(Long.valueOf(var6.IliIlllilIi()));
            }
         }

         return Collections.unmodifiableSet(var4);
      }
   }

   private lliIIliiliIIli lIiiIiIlilli(lliIIliiliIIli c) {
      LinkedHashMap var2 = this.IiIlilliliIlilli.computeIfAbsent(Long.valueOf(c.liiiIIllIl()), k -> new LinkedHashMap<Long, lliIIliiliIIli>(16, 0.75F, false) {
            @Override
            protected boolean removeEldestEntry(Entry<Long, lliIIliiliIIli> e) {
               return this.size() > 512;
            }
         });
      lliIIliiliIIli var3 = (lliIIliiliIIli)var2.remove(Long.valueOf(c.IliIlllilIi()));
      var2.put(Long.valueOf(c.IliIlllilIi()), c);
      return var3;
   }

   public void IIillIiliIil() {
      this.IiIlilliliIlilli.clear();
      this.iiIlilliIIllilli = 0;
      this.lIllilliiIllilli = "";
   }

   public int iIlIlllllill(long component, long geometryRevision, long stand) {
      lliIIliiliIIli var7 = this.lIiiIiIlilli(new lliIIliiliIIli(component, geometryRevision, IiIIiiilliIIiiil.lIIiiIIiil, stand, 0, ""));
      if (var7 != null && var7.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
         this.iiIlilliIIllilli++;
         return 1;
      } else {
         return 0;
      }
   }

   public IlIlilllIlil() {
      this.lIllilliiIllilli = "";
   }

   public IiIIiiilliIIiiil IliIlllilIi(long geometryRevision, long stand, long component) {
      lliIIliiliIIli var7 = this.liiiIIllIl(geometryRevision, stand);
      return var7 != null && var7.IilliliilIIi() == component ? var7.iIlIlllllill() : IiIIiiilliIIiiil.IlIiiIIiil;
   }

   public int IilliliilIIi(long geometryRevision, long component, long failureClass, String stand) {
      long var11 = 6843918761858518634L;
      String var8 = stand == null ? "" : stand;
      this.lIllilliiIllilli = var8;
      lliIIliiliIIli var9 = this.liiiIIllIl(geometryRevision, component);
      var11 ^= ((long)(var9 != null && var9.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil ? var9.lIiiIiIlilli() + 1 : 1) << 32 ^ var11) & -1L << 32;
      this.lIiiIiIlilli(new lliIIliiliIIli(geometryRevision, component, IiIIiiilliIIiiil.iIIiiIIiil, failureClass, (int)(var11 >>> 32), var8));
      return (int)(var11 >>> 32);
   }

   public lliIIliiliIIli liiiIIllIl(long component, long stand) {
      Map var5 = this.IiIlilliliIlilli.get(stand);
      return var5 == null ? null : (lliIIliiliIIli)var5.get(component);
   }

   public int IlIlllIlilIl(long stand, long component) {
      lliIIliiliIIli var5 = this.liiiIIllIl(stand, component);
      return var5 == null ? 0 : var5.lIiiIiIlilli();
   }

   public int Illlllllilll() {
      long var4 = 220391487608220932L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (Map var3 : this.IiIlilliliIlilli.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public int IiIlliIliiIl() {
      return this.iiIlilliIIllilli;
   }

   public boolean IIIllIIliIIl(long component, long stand) {
      lliIIliiliIIli var5 = this.liiiIIllIl(component, stand);
      return var5 != null && var5.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil;
   }

   public String Ililllililil() {
      long var7 = -5180561275536861636L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;

      for (Map var4 : this.IiIlilliliIlilli.values()) {
         for (lliIIliiliIIli var6 : var4.values()) {
            if (var6.iIlIlllllill() == IiIIiiilliIIiiil.iIIiiIIiil) {
               var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
            } else {
               var7 += 4294967296L;
            }
         }
      }

      return IIIilIIiiIIi<"IIIilIIiiIIi","f9G0sm8b+XOqCI5sIQUYVN/8XM3dN6gbAXObjF2VbSMUrS5O4ru75YBkhlSGCuXeV/lUEPt+Cnk=">()
         + this.IiIlilliliIlilli.size()
         + IIIilIIiiIIi<"IIIilIIiiIIi","JuboLmHUQH8TS4Z+r7QkHNA3aBv8UXIPKv45mY22VictYw==">()
         + (int)(var7 >>> 32)
         + IIIilIIiiIIi<"IIIilIIiiIIi","y9kRHiNh1zVRc67RsDgtS9WGc+H4LWC95LPSxfmi6AOtsw==">()
         + (int)var7
         + IIIilIIiiIIi<"IIIilIIiiIIi","PjR1zMvxc+WCpLAb+4EiMW1cRSPNa03GfS7rfSr0K9nYrnecBq3mQiU=">()
         + this.iiIlilliIIllilli
         + (this.lIllilliiIllilli.isEmpty() ? "" : IIIilIIiiIIi<"IIIilIIiiIIi","/9zumCxAn8c9eRG5KQS5WD4PGgnFcxC4YgSMTUIi5lAwbw==">() + this.lIllilliiIllilli);
   }
}
