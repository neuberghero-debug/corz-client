package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public final class IIillIiliIil {
   public int iillIlIIilIl;
   private int IiIIIlliIIIl;
   private IiillIilliillIil iIiIIlIliIIl;
   public int liilIliiilIl;
   private int IllIIllllIIl;
   private String lliIIliliIIl;
   private IIlliIIllIlliIIl iliiiIiiii = IIlliIIllIlliIIl.IIlilIilIl;
   private final Set<Long> illIIlIilIIl;
   private int IIIIIllIIIIl = Integer.MIN_VALUE;
   public int iIllIlIlllIl;
   private long IIiIIllIiIIl;
   public int IlilIlllilIl;
   public int IlliIlllliIl;
   public int lIilIliIilIl;
   public int iiIiIlIIliIl;
   public int iIIiIlIlIiIl;
   public int ililIlIiilIl;
   public int IlIlIlllIlIl;
   private int llIIIlilIIIl;
   private int iiIIIlIIlIIl;
   public int IIllIllIllIl;
   private int iIIIIlIlIIIl;
   public int IillIllillIl;
   public int IiIiIlliIiIl;
   private boolean IIiiIllIiiIl;
   public int llIiIlilIiIl;
   public int ilIlIlIiIlIl;
   public int illiIlIiliIl;
   public int lIIlIliIIlIl;
   public static final int iiiIIlIIIlIl = 3;
   public int llllIlilllIl;
   private Iiilliiliiil liiiiiiiii;
   private final Map<lIIliliiIIlili, iIIIiiilIlIIiiil> IiiIIlliiIIl;
   public int liIlIliiIlIl;
   private int lilIIliilIIl;
   public int lIliIliIliIl;
   public final Map<String, Integer> liliIliiliIl;
   private long lIlIIliIlIIl;
   public int IIIiIllIIiIl;

   public Iiilliiliiil Iiilliiliiil() {
      return this.liiiiiiiii;
   }

   public boolean IilliliilIIi() {
      return this.iliiiIiiii == IIlliIIllIlliIIl.lIlilIilIl || this.iliiiIiiii == IIlliIIllIlliIIl.iIlilIilIl || this.iliiiIiiii == IIlliIIllIlliIIl.IllilIilIl;
   }

   public boolean IIIIllIIIl(int toY, int fromY) {
      long var4 = 2650642001315599993L;
      if (this.iliiiIiiii == IIlliIIllIlliIIl.lllilIilIl && this.liiiiiiiii != null) {
         this.llllIlilllIl++;
         var4 ^= ((long)(toY - fromY >= 2 && fromY <= this.IIIIIllIIIIl && this.liiiiiiiii.IilliliilIIi() > 0 ? 1 : 0) << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) != 0) {
            this.IillIllillIl++;
         }

         return (boolean)((int)(var4 >>> 32));
      } else {
         return false;
      }
   }

   public boolean IIlilIliiIli(long feet) {
      if (this.liiiIIllIl() && this.liiiiiiiii != null && this.liiiiiiiii.iIlIlllllill(feet)) {
         if (this.iliiiIiiii != IIlliIIllIlliIIl.lllilIilIl) {
            this.iliiiIiiii = IIlliIIllIlliIIl.lllilIilIl;
            this.IlIlIlllIlIl++;
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean iIlIlllllill() {
      return this.iliiiIiiii == IIlliIIllIlliIIl.lllilIilIl;
   }

   public void IiIIlliIIl() {
      this.IIllIllIllIl++;
      this.IIiiIllIiiIl = true;
   }

   public IiillIilliillIil iliIiiliiiii() {
      return this.iIiIIlIliIIl;
   }

   public IillIIlilillIIli Iilililiiili(int fy, int fz, int fx) {
      return this.IIiilIiiiIii(
         fy,
         fz,
         fx,
         p -> this.liiiiiiiii.lIIIlliIIIll.getOrDefault(p.IliIlllilIi(), List.of()).stream().anyMatch(f -> f.liiiIIllIl() == p.liiiIIllIl()),
         p -> true
      );
   }

   public int Ililllililil() {
      return this.IIIIIllIIIIl;
   }

   public int IIIilIIiiIIi() {
      return this.liiiiiiiii == null ? 0 : this.liiiiiiiii.IilliliilIIi();
   }

   public void IIlllIlliIll() {
      if (this.IilliliilIIi()) {
         this.iliiiIiiii = IIlliIIllIlliIIl.IllilIilIl;
      }
   }

   public void iiIIlIIlIl() {
      this.IIiiIllIiiIl = true;
   }

   public void IIillIiliIil(String why) {
      if (this.IilliliilIIi()) {
         this.IlilIlllilIl++;
         this.lliIIliliIIl = why;
         this.iliiiIiiii = IIlliIIllIlliIIl.lililIilIl;
         this.liiiiiiiii = null;
      }
   }

   public void IllIllllIl(long stand) {
      this.illIIlIilIIl.add(stand);
      this.lIilIliIilIl++;
   }

   public void llIIlilIIl(long feet) {
      this.lIilIliIilIl++;
      if (this.liiiiiiiii != null && this.liiiiiiiii.iIlIlllllill(feet)) {
         this.iliiiIiiii = IIlliIIllIlliIIl.lllilIilIl;
         this.lilIIliilIIl = 0;
         this.lIlIIliIlIIl = feet;
      }
   }

   public String IlIlllIlilIl() {
      return this.lliIIliliIIl;
   }

   public boolean liiiIIllIl() {
      return this.iliiiIiiii == IIlliIIllIlliIIl.lIlilIilIl
         || this.iliiiIiiii == IIlliIIllIlliIIl.iIlilIilIl
         || this.iliiiIiiii == IIlliIIllIlliIIl.IllilIilIl
         || this.iliiiIiiii == IIlliIIllIlliIIl.lllilIilIl
         || this.iliiiIiiii == IIlliIIllIlliIIl.illilIilIl;
   }

   public void IiIiliIiiiIi(Iiilliiliiil feet, long d) {
      this.liiiiiiiii = feet;
      this.IIIIIllIIIIl = feet.IiiiIlliiiIl;
      this.IllIIllllIIl = feet.lIiiIiIlilli();
      this.illIIlIilIIl.clear();
      this.lilIIliilIIl = 0;
      this.lIIlIliIIlIl++;
      this.IIiIIllIiIIl++;
      this.IIiiIllIiiIl = false;
      if (feet.iIlIlllllill(d)) {
         this.iliiiIiiii = IIlliIIllIlliIIl.lllilIilIl;
         this.IlIlIlllIlIl++;
      } else {
         this.iliiiIiiii = IIlliIIllIlliIIl.IllilIilIl;
      }

      this.lIlIIliIlIIl = d;
      this.iIIIIlIlIIIl = this.llIIIlilIIIl = 0;
      this.IiIIIlliIIIl = this.iiIIIlIIlIIl = Integer.MIN_VALUE;
   }

   private long Iiiiliiiiiii(int fx, int fz) {
      long var10 = 1368200790540570895L;
      long var3 = 0L;
      var10 ^= (9223372032559808512L ^ var10) & -1L << 32;

      for (long var7 : this.liiiiiiiii.iiiiIlIIIIll) {
         var10 ^= ((long)Math.max(Math.abs(llIiIiililIiIiil.IiIlliIliiIl(var7) - fx), Math.abs(llIiIiililIiIiil.Illlllllilll(var7) - fz)) ^ var10) & -1L >>> 32;
         if ((int)var10 < (int)(var10 >>> 32)) {
            var10 ^= ((long)((int)var10) << 32 ^ var10) & -1L << 32;
            var3 = var7;
         }
      }

      return var3;
   }

   public String IIiIllIiIl() {
      return ilIllIiIll<"ilIllIiIll","DCGVnM285c2eDHIe6cCB8t0I6k8UsWPzB998lV7OLioeIepr2nSU7WsVtfp/iGM=">()
         + this.lIIlIliIIlIl
         + ilIllIiIll<"ilIllIiIll","ydPNzb2qvf0+t62AYWm11VVccPYOTJAG/AglsjldxIm4u1lPO1tLr99JkwY=">()
         + this.IlIlIlllIlIl
         + ilIllIiIll<"ilIllIiIll","wMMsQO+8flF8TKftdPiRq0huyUQdv48+AI3IP0nwiC24tY+NKALbjx8A">()
         + this.ilIlIlIiIlIl
         + ilIllIiIll<"ilIllIiIll","JYx3J8WQqtQdyZzRRCH1yRlGOIsEiauONStzzjxRJptSVMwAx0iUPdajsfaBOAo=">()
         + this.liIlIliiIlIl
         + ilIllIiIll<"ilIllIiIll","CoSAm+4RCb5881ZVwLXZrQgQU/u639ewkZsoTaqqrFgNbACBfKvSl+Yu1VZLF08=">()
         + this.IIllIllIllIl
         + ilIllIiIll<"ilIllIiIll","H47UmOuJ6hMfX9f6ldIhQjAI38lOHgw50/bJUb7zJ0/TtWIyogGPQTP7Upwbt6E=">()
         + this.iIllIlIlllIl
         + ilIllIiIll<"ilIllIiIll","6s+tGkwGZMiTFcepQotTtAVDnX1GYKkGC4tjDoTg8tYalm+/QV0pbzcP71a0c4OahvX92Q==">()
         + this.llllIlilllIl
         + ilIllIiIll<"ilIllIiIll","c7FALpfe4V865WXl83+8jvrtpcHnT4ztGZahjt2hKWdU0uK1apl6HoPmxhcbV8aqcQ==">()
         + this.IillIllillIl
         + ilIllIiIll<"ilIllIiIll","PIGGbXZgr7ugX5n8/Vp0GV9U95OhQ0ZehnwHgMlArueGywKZoGzpjQTeI1LtaqQcMzQj/o4=">()
         + this.iillIlIIilIl
         + ilIllIiIll<"ilIllIiIll","DEazGsAfwEl1/yw8GAu+Cpnb4dvv4jzo6JAwaCO14t6m15WLBxH4br/rZAeRgvugNQ==">()
         + this.lIilIliIilIl
         + ilIllIiIll<"ilIllIiIll","+8kHlYH0E/rpxwjVD2bzhaYlT8Wg1E+KWmi8kI/Y8YzOcZUB2248">()
         + this.iliiiIiiii
         + (
            this.liiiIIllIl()
               ? ilIllIiIll<"ilIllIiIll","PZdSVcmVHHfG9bvJ8OStn9uF6xaKu+9EiKVDRLGOQLrfIcU=">()
                  + this.IIIIIllIIIIl
                  + ilIllIiIll<"ilIllIiIll","AARxgypkxRFuIQVatEh5roEQM0HVGzSV922ACLFdE3dQngbZ6go=">()
                  + (this.liiiiiiiii == null ? 0 : this.liiiiiiiii.lIiiIiIlilli())
                  + ilIllIiIll<"ilIllIiIll","0blM8ca210Gib0dWMQexpVltg5MFEXy2ZEBNUqvk4n1qZBIyZ+s=">()
                  + this.IIIilIIiiIIi()
               : ""
         );
   }

   public IillIIlilillIIli Iliilliiilii(
      int fz, int fx, int executableNow, Predicate<lliliIiililiIi> edgeAllowed, Predicate<lliliIiililiIi> fy, BiPredicate<Long, Long> executableAtStand
   ) {
      long var17 = -270892526989514742L;
      long var19 = -6221665673968741977L;
      long var21 = -4099228530693959878L;
      if (this.liiiIIllIl() && this.liiiiiiiii != null) {
         long var7 = llIiIiililIiIiil.IIIllIIliIIl(fz, fx, executableNow);
         if (var7 != this.lIlIIliIlIIl) {
            var17 ^= ((long)(fz - llIiIiililIiIiil.IiIlliIliiIl(this.lIlIIliIlIIl)) << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)(executableNow - llIiIiililIiIiil.Illlllllilll(this.lIlIIliIlIIl)) ^ var17) & -1L >>> 32;
            if (Math.abs((int)(var17 >>> 32)) + Math.abs((int)var17) > 0 && Math.abs((int)(var17 >>> 32)) <= 3 && Math.abs((int)var17) <= 3) {
               this.iIIIIlIlIIIl = Integer.signum((int)(var17 >>> 32));
               this.llIIIlilIIIl = Integer.signum((int)var17);
            }

            this.lIlIIliIlIIl = var7;
         }

         if (!this.liiiiiiiii.iIlIlllllill(var7)) {
            if (this.iliiiIiiii == IIlliIIllIlliIIl.lllilIilIl) {
               if (++this.lilIIliilIIl > 3) {
                  return new IillIIlilillIIli(
                     llliIllilliIll.iIliiIlilIlliiIlil,
                     List.of(),
                     0L,
                     ilIllIiIll<"ilIllIiIll","WmDuCbzJtyqm4WqBBMPPcx2ppih8A2N/nKMe2LtDcz4s7poIq25orNZ2Wrs=">()
                  );
               } else {
                  long var23 = this.Iiiiliiiiiii(fz, executableNow);
                  return var23 == 0L
                     ? new IillIIlilillIIli(
                        llliIllilliIll.iIliiIlilIlliiIlil,
                        List.of(),
                        0L,
                        ilIllIiIll<"ilIllIiIll","R0gemk0Jp2cx3A20sfXUY4BaYZCiHB4CAJ+dPTcMklZeW6ejekVgUM+4IHXHCwYt">()
                     )
                     : new IillIIlilillIIli(
                        llliIllilliIll.liIiiIliliiIiiIlil,
                        List.of(),
                        var23,
                        ilIllIiIll<"ilIllIiIll","HglJEag4LO24sqqqDMt6ByADXFEhYOw+nSX/gfv/pbep0L3JOFrUSyki7mSjZmZyEQ==">()
                     );
               }
            } else {
               return !this.liiiiiiiii.IliIlllilIi()
                  ? new IillIIlilillIIli(
                     llliIllilliIll.iIliiIlilIlliiIlil,
                     List.of(),
                     0L,
                     ilIllIiIll<"ilIllIiIll","x+MOVSDcoeaJN5wqFcSAe1Tz+aaeu3Oe9rilU6pDxGKI0m+LDB4w8iMuwRq4L3tRKQdyRaC4UJqhWhLn">()
                  )
                  : new IillIIlilillIIli(
                     llliIllilliIll.IIliiIlillIliiIlil,
                     List.of(),
                     this.Iiiiliiiiiii(fz, executableNow),
                     ilIllIiIll<"ilIllIiIll","tFTUH9jwC6Lbm/HEBOVvruEmtRUMcW/gWV5BBWTnc5hOb70K8CG4eUFKUzcakzHJVc4=">()
                  );
            }
         } else {
            if (this.iliiiIiiii != IIlliIIllIlliIIl.lllilIilIl) {
               this.iliiiIiiii = IIlliIIllIlliIIl.lllilIilIl;
               this.IlIlIlllIlIl++;
            }

            this.lilIIliilIIl = 0;
            this.ililIlIiilIl++;
            ArrayList var9 = new ArrayList();

            for (long var11 : iIiIilIiIliIilIi.IiIiliIiiiIi(this.liiiiiiiii.lIIIlliIIIll.keySet())) {
               long var28 = var19 ^ ((long)(llIiIiililIiIiil.IiIlliIliiIl(var11) - fz) << 32 ^ var19) & -1L << 32;
               var19 = var28 ^ ((long)(llIiIiililIiIiil.Illlllllilll(var11) - executableNow) ^ var28) & -1L >>> 32;
               iIlIililIllIilil var15 = Math.abs((int)(var19 >>> 32)) + Math.abs((int)var19) == 1 ? iIlIililIllIilil.lIIiiIIlil : iIlIililIllIilil.iIIiiIIlil;
               lliliIiililiIi var16 = new lliliIiililiIi(var11, var7, var15, 0, (int)(var19 >>> 32), (int)var19);
               if (edgeAllowed.test(var16)) {
                  var9.add(var16);
               }
            }

            this.liilIliiilIl = var9.size();
            List var24 = iIiIilIiIliIilIi.Iiilliiliiil(
               this.liiiiiiiii, fz, executableNow, this.IiIIIlliIIIl, this.iiIIIlIIlIIl, this.iIIIIlIlIIIl, this.llIIIlilIIIl, this.illIIlIilIIl
            );
            HashMap var25 = new HashMap();

            for (long var29 = var21 ^ (0L ^ var21) & -1L << 32; (int)(var29 >>> 32) < var24.size(); var29 += 4294967296L) {
               var25.put(((lliliIiililiIi)var24.get((int)(var29 >>> 32))).IliIlllilIi(), (int)(var29 >>> 32));
            }

            var9.sort(Comparator.comparingInt(p -> var25.getOrDefault(p.IliIlllilIi(), Integer.MAX_VALUE)));
            if (!var9.isEmpty()) {
               return new IillIIlilillIIli(
                  llliIllilliIll.ilIiiIlilIiIiiIlil,
                  var9,
                  var7,
                  ilIllIiIll<"ilIllIiIll","8WV5OX8MbVDfajHBuNnDtDRhkAdOlJeXeaBcsF0offlwiIdzpmeeH69OsG/TlixijCyG+cBcGM+CDajXy70GookuulU=">()
               );
            } else {
               List var12 = iIiIilIiIliIilIi.Illlllllilll(this.liiiiiiiii, fz, executableNow, this.illIIlIilIIl, fy, executableAtStand);
               if (var12.isEmpty()) {
                  return new IillIIlilillIIli(
                     llliIllilliIll.iIliiIlilIlliiIlil,
                     var12,
                     0L,
                     this.liiiiiiiii.IilliliilIIi() == 0
                        ? ilIllIiIll<"ilIllIiIll","as13Wz37J62lRv64PcaKBf75oSkWu2fws5DfWM6+Vqx1GRiXXD9T6+H9It3vEg==">()
                        : ilIllIiIll<"ilIllIiIll","EI+3VpdUeug/Lg6Eeon9NiEg64VTK25ui8utLR3NKEBGXPG/NGzKxVtNGZxzn4K3TWQBCfYw7PPpQlwTuD3paqV8SQW3cVLz+g==">()
                  );
               } else {
                  lliliIiililiIi var13 = (lliliIiililiIi)var12.get(0);
                  this.iIIiIlIlIiIl++;
                  this.llIiIlilIiIl = (int)var12.stream()
                     .filter(first -> first.liiiIIllIl() == var13.liiiIIllIl())
                     .map(lliliIiililiIi::IliIlllilIi)
                     .distinct()
                     .count();
                  return new IillIIlilillIIli(
                     llliIllilliIll.liIiiIliliiIiiIlil,
                     var12,
                     var13.liiiIIllIl(),
                     var13.IilliliilIIi() > 8
                        ? ilIllIiIll<"ilIllIiIll","JbsmvoQtaQLEgpvdjWYc5LpSw7zOkBT1S7O+vRAx6Rnnbtnp6gKdozlFieGoFExwRIsh/w==">()
                        : ilIllIiIll<"ilIllIiIll","5rsVL0ol4cvi17zZHMGry4Qg1Te4EhSjpcP9Jxi73tpQoSk9XoSROP/B">()
                  );
               }
            }
         }
      } else {
         return new IillIIlilillIIli(
            llliIllilliIll.IlIiiIlilllIiiIlil, List.of(), 0L, ilIllIiIll<"ilIllIiIll","RbcvxJOhYPkKyP4PFUsYkdZmC2WCn9gqadSH/JnkYbv36Wfp">()
         );
      }
   }

   public void illIlIilIl(String why) {
      if (this.IilliliilIIi()) {
         this.IIillIiliIil(why);
      } else {
         if (this.iliiiIiiii == IIlliIIllIlliIIl.lllilIilIl) {
            this.iliiiIiiii = IIlliIIllIlliIIl.illilIilIl;
            this.ilIlIlIiIlIl++;
         }

         this.iliiiIiiii = IIlliIIllIlliIIl.IililIilIl;
         this.liiiiiiiii = null;
         this.illIIlIilIIl.clear();
      }
   }

   public Set<Long> IlIillIiilIi() {
      return this.illIIlIilIIl;
   }

   public void lilIliilIl() {
      this.iliiiIiiii = IIlliIIllIlliIIl.IIlilIilIl;
      this.liiiiiiiii = null;
      this.IIIIIllIIIIl = Integer.MIN_VALUE;
      this.illIIlIilIIl.clear();
      this.lilIIliilIIl = 0;
      this.IiiIIlliiIIl.clear();
      this.iIiIIlIliIIl = IiillIilliillIil.liiliIlIil;
      this.lliIIliliIIl = ilIllIiIll<"ilIllIiIll","Tv1WOqWWd3ERODxJQzOnE3cGWG+QTCY4PFFtl6cJhIw=">();
      this.IIiIIllIiIIl = 0L;
      this.lIIlIliIIlIl = this.IlIlIlllIlIl = this.ilIlIlIiIlIl = this.liIlIliiIlIl = this.IIllIllIllIl = this.iIllIlIlllIl = 0;
      this.llllIlilllIl = this.IillIllillIl = this.iillIlIIilIl = this.lIilIliIilIl = this.IlilIlllilIl = 0;
      this.ililIlIiilIl = this.liilIliiilIl = this.IIIiIllIIiIl = this.iIIiIlIlIiIl = this.llIiIlilIiIl = 0;
      this.IiIiIlliIiIl = this.iiIiIlIIliIl = this.lIliIliIliIl = this.IlliIlllliIl = this.illiIlIiliIl = 0;
      this.liliIliiliIl.clear();
   }

   public void IIIllIIliIIl(IiillIilliillIil context) {
      this.iIiIIlIliIIl = context;
   }

   public void iIIIlIlIIl(long cell) {
      long var5 = -3206260977651791622L;
      if (this.liiiIIllIl() && this.liiiiiiiii != null && llIiIiililIiIiil.IIlllIlliIll(cell) == this.IIIIIllIIIIl) {
         this.liIlIliiIlIl++;
         if (!this.IIiiIllIiiIl) {
            this.IIIiIllIIiIl++;
         }

         this.IIiiIllIiiIl = false;
         var5 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(cell) << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)llIiIiililIiIiil.Illlllllilll(cell) ^ var5) & -1L >>> 32;
         if (this.IiIIIlliIIIl != Integer.MIN_VALUE) {
            this.iIIIIlIlIIIl = Integer.signum((int)(var5 >>> 32) - this.IiIIIlliIIIl);
            this.llIIIlilIIIl = Integer.signum((int)var5 - this.iiIIIlIIlIIl);
         }

         this.IiIIIlliIIIl = (int)(var5 >>> 32);
         this.iiIIIlIIlIIl = (int)var5;
      }
   }

   public boolean Illlllllilll(String strategy, long stand, long geometry) {
      iIIIiiilIlIIiiil var6 = this.IiiIIlliiIIl.get(new lIIliliiIIlili(strategy, stand));
      return var6 == null || var6.IliIlllilIi() != geometry;
   }

   public void lIlIliIlIl() {
      this.iillIlIIilIl++;
   }

   public IIlliIIllIlliIIl IliIlllilIi() {
      return this.iliiiIiiii;
   }

   public long lIiiIiIlilli() {
      return this.IIiIIllIiIIl;
   }

   public IillIIlilillIIli IIiilIiiiIii(int fx, int executableNow, int fy, Predicate<lliliIiililiIi> executableAtStand, Predicate<lliliIiililiIi> fz) {
      return this.Iliilliiilii(fx, executableNow, fy, executableAtStand, fz, (b, a) -> true);
   }

   public void Iilllilliill(String why, long strategy, long stand, String geometry) {
      this.IiiIIlliiIIl.put(new lIIliliiIIlili(why, strategy), new iIIIiiilIlIIiiil(stand, geometry));
      this.lliIIliliIIl = why + ilIllIiIll<"ilIllIiIll","UlocLEgl1sNQZJr/LQLy7zgu/71MA+hidJkuf9Tl">() + geometry;
   }

   public IIillIiliIil() {
      this.IiIIIlliIIIl = Integer.MIN_VALUE;
      this.iiIIIlIIlIIl = Integer.MIN_VALUE;
      this.illIIlIilIIl = new HashSet<>();
      this.iIiIIlIliIIl = IiillIilliillIil.liiliIlIil;
      this.lliIIliliIIl = ilIllIiIll<"ilIllIiIll","Tv1WOqWWd3ERODxJQzOnE3cGWG+QTCY4PFFtl6cJhIw=">();
      this.IiiIIlliiIIl = new HashMap<>();
      this.liliIliiliIl = new LinkedHashMap<>();
   }

   public void IiIlliIliiIl() {
      if (this.IilliliilIIi()) {
         this.iliiiIiiii = IIlliIIllIlliIIl.iIlilIilIl;
      }
   }

   public void Illillliilli(Iiilliiliiil d) {
      if (d != null && this.liiiIIllIl()) {
         if (d.lIiiIiIlilli() > this.IllIIllllIIl) {
            this.iIllIlIlllIl = this.iIllIlIlllIl + (d.lIiiIiIlilli() - this.IllIIllllIIl);
         }

         this.IllIIllllIIl = Math.max(this.IllIIllllIIl, d.lIiiIiIlilli());
         this.liiiiiiiii = d;
      }
   }
}
