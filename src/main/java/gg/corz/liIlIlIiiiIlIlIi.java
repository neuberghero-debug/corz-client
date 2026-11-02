package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public final class liIlIlIiiiIlIlIi {
   private int IIIlIIIIIi;
   private int iIllIIIIIi;
   public static final int IilIIIIIIi = 2;
   private long iliIIIIIIi;
   private long llIlIIIIIi;
   public static final int lilIIIIIIi = 3;
   private int IIllIIIIIi;
   public static final long iIiIIIIIIi = Long.MIN_VALUE;
   public static final int IllIIIIIIi = 1024;
   private int lIllIIIIIi;
   private final Map<Long, Long> ilIlIIIIIi;
   public static final int IIiIIIIIIi = 2;
   private long IiIlIIIIIi;
   public static final int IliIIIIIIi = 2;
   private final LinkedHashMap<Long, iiIlllIIllll> lliIIIIIIi = new LinkedHashMap<>();
   private int liiIIIIIIi;
   public static final int lllIIIIIIi = 3;
   private int iIIlIIIIIi;
   private int iiiIIIIIIi;
   private int IiiIIIIIIi;
   public static final int iilIIIIIIi = 4;
   private long IlIlIIIIIi;
   private final ArrayList<Long> liIlIIIIIi;
   private String iiIlIIIIIi;
   public static final int illIIIIIIi = 2;
   public static final int lIiIIIIIIi = 2;
   private int lIIlIIIIIi;

   public int lilIliilIl(long same, lIllIIIiiIllIIIi... root) {
      long var10 = 6395442534871416941L;
      long var12 = 8113816228720738054L;
      iiIlllIIllll var4 = this.lliIIIIIIi.get(same);
      if (var4 != null && !var4.IliIlllilIi()) {
         var10 ^= (0L ^ var10) & -1L << 32;
         lIllIIIiiIllIIIi[] var6 = root;
         var10 ^= ((long)root.length ^ var10) & -1L >>> 32;

         for (long var16 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var16 >>> 32) < (int)var10; var16 += 4294967296L) {
            lIllIIIiiIllIIIi var9 = var6[(int)(var16 >>> 32)];
            if (var4.IllilIIilllilIIi.add(var9)) {
               var10 += 4294967296L;
            }
         }

         if ((int)(var10 >>> 32) > 0) {
            this.IiIlIIIIIi++;
         }

         if ((int)(var10 >>> 32) > 0) {
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","U5uh30Qeh9tfJ8b2aR//m+/r7VvhUE9cEEBcHpJAdCGCBA==">()
               + Arrays.toString((Object[])root)
               + iliIiIiiIi<"iliIiIiiIi","2CPVd7OJ6f+IkHdSAQx6jR5VhIBovM5W8Tw4wAHxaiYKMeSMw0z7CSoDaiNiDAlxZjQxMv3Isg==">()
               + iIlIiIllIi(same)
               + iliIiIiiIi<"iliIiIiiIi","+MkxyOW/vlQM1cmsU/8hVFhJ3aInrvLgfWUhPrxTt12WE1gQ/RZXRpFDXGX9/SzL">();
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public IiilliIlliilliIl iiIIlIIlIl(long dependencyKey, boolean built) {
      this.IiIlIIIIIi++;

      for (iiIlllIIllll var5 : this.lliIIIIIIi.values()) {
         if (var5.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil && var5.lililIIiiililIIi == dependencyKey) {
            iiiIlIIiIIIllIIi var6 = var5.iiIilIIiIIlilIIi;
            if (built) {
               var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
               var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               this.iiiIIIIIIi++;
               var5.iiiilIIiIIIIiIIi = 0;
               var5.IIlIiIIilIlIiIIi = 0;
               var5.iIlIiIIiIllIiIIi = 0;
               var5.IlIIiIIillIIiIIi = 0;
               var5.IliIiIIilliIiIIi = this.IlIlIIIIIi;
               var5.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","vC+op56XoljFeiVFJdtS6ZtKp8wSBw/aSqyUKXBfthyvPc67hbuc1z42Ef8=">();
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
                  + iIlIiIllIi(var5.llIilIIiilIilIIi)
                  + iliIiIiiIi<"iliIiIiiIi","Cc1C9BoTQdxIimiDYUNMuhISnAP09VklEFUMEODnPg2baZiDj2I7fWo=">();
            } else {
               var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var5.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","WtTpkCxLKJHnxLEJQubDcCq4QGu8vAKdgUTsHGH0WE9k4WVjcn2aCOLkeLw=">()
                  + dependencyKey
                  + iliIiIiiIi<"iliIiIiiIi","Ja1N6j/6sZ9v46EWvjOSpq+PB78fnh2rhRtLQh4MxX27JIMcoNj2q6u4W1PdVgBbfZ4=">();
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","xrnO52cjuxqtRpfEBSImyZh+BTHKcgkVEXu+yseIDpntOOXiyYxFut1V8H3NhjXnisgm">()
                  + iIlIiIllIi(var5.llIilIIiilIilIIi)
                  + iliIiIiiIi<"iliIiIiiIi","yukPX4uYYeC6hq5+HvZAd4epnhQfv/SxtmQ4SEvo79+rvkl7sS0=">()
                  + var5.lIlilIIiiIlilIIi
                  + iliIiIiiIi<"iliIiIiiIi","qAYV3DlzAraOUVzHWcgFbrk+1i3FY38xk3e2M1E6H6EtmQHqy+A1pj3FNf2iDvw/7r6Xa9ykMUY=">()
                  + IlIIillIIi(var5);
            }

            return new IiilliIlliilliIl(var6, var5.iiIilIIiIIlilIIi, built ? null : IlIIillIIi(var5), var5.IllliIIilllliIIi);
         }
      }

      this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","HUG7tPC1M5WsgCzkx27C24Ur5fhnNWpGGP7MVdpRdrh2gKcO">()
         + dependencyKey
         + iliIiIiiIi<"iliIiIiiIi","DwotmY3rpMvrPOI1dge8bw5bHp8FE7Armu7xmJeRNThuHjja">()
         + (
            built
               ? iliIiIiiIi<"iliIiIiiIi","g/QLfhwXWTxQzq55a3JGwuwI59Zi9Wvl7OwQu3bC5hHR">()
               : iliIiIiiIi<"iliIiIiiIi","Tzic8L/myYKspl+3Yer8bhfKifMsQYTEZf8Zt1T//bOzBg==">()
         )
         + iliIiIiiIi<"iliIiIiiIi","NrfvSSM/6etCdcYdj7Rj/WebFA5AzvTDG0RZJPh81GDD+cYwlVvvxLRFETF/bGaxiHZtzaVOD6OI8BLTq4yPqE4dEtmjM4qftgVbbFr6Ano4HH6Hj5mzN0OB">();
      return null;
   }

   public int liIIiiiIIi() {
      return this.IIllIIIIIi;
   }

   private static boolean iliIiiliiiii(long[] v, long a) {
      long var8 = -3518259076833904322L;
      long[] var3 = v;
      var8 ^= ((long)v.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         if (var6 == a) {
            return true;
         }
      }

      return false;
   }

   private void lIiiIiIlilli(iiIlllIIllll e) {
      ArrayList var2 = null;

      for (long var4 : e.IilIiIIililIiIIi) {
         Long var6 = this.ilIlIIIIIi.get(var4);
         if (var6 == null || var6 != e.llIilIIiilIilIIi) {
            iiIlllIIllll var7 = var6 == null ? null : this.lliIIIIIIi.get(var6);
            if (var7 == null || var7.IliIlllilIi()) {
               if (var2 == null) {
                  var2 = new ArrayList<>(e.IiIilIIiliIilIIi);
               }

               var2.add(var4);
            }
         }
      }

      if (var2 != null) {
         e.IilIiIIililIiIIi = var2;
      } else {
         e.IilIiIIililIiIIi = null;
         e.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
      }
   }

   public int iiIilIIlil() {
      return this.liiIIIIIIi;
   }

   private void IiIlliIliiIl(long root) {
      iiIlllIIllll var3 = this.lliIIIIIIi.remove(Long.valueOf(root));
      if (var3 != null) {
         for (long var5 : var3.IiIilIIiliIilIIi) {
            this.ilIlIIIIIi.remove(var5, root);
         }

         this.liIlIIIIIi.addAll(var3.IiIilIIiliIilIIi);
         if (var3.IilIiIIililIiIIi != null) {
            this.liIlIIIIIi.addAll(var3.IilIiIIililIiIIi);
         }
      }
   }

   public IiilliIlliilliIl IllIllllIl(long why, String root) {
      this.IiIlIIIIIi++;
      iiIlllIIllll var4 = this.lliIIIIIIi.get(why);
      if (var4 != null && !var4.IliIlllilIi()) {
         iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
         var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
         var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
         this.iiiIIIIIIi++;
         var4.iiiilIIiIIIIiIIi = 0;
         var4.IIlIiIIilIlIiIIi = 0;
         var4.iIlIiIIiIllIiIIi = 0;
         var4.IlIIiIIillIIiIIi = 0;
         var4.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var4.IllliIIilllliIIi = root == null ? "" : root;
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
            + iIlIiIllIi(why)
            + iliIiIiiIi<"iliIiIiiIi","FivByQB7dJu3WuIbQL7k5lDMmKbYEtxtXFOPX72nCaejXCnCR0jJKzwMZw==">()
            + var4.IllliIIilllliIIi
            + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
         return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, null, var4.IllliIIilllliIIi);
      } else {
         return null;
      }
   }

   private IiilliIlliilliIl lIIIiiIIIi(long r, lIllIIIiiIllIIIi s, lIliiIiliIliiIil t, IiilliIlliilliIl root) {
      this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","xrnO52cjuxqtRpfEBSImyZh+BTHKcgkVEXu+yseIDpntOOXiyYxFut1V8H3NhjXnisgm">()
         + iIlIiIllIi(r)
         + iliIiIiiIi<"iliIiIiiIi","yukPX4uYYeC6hq5+HvZAd4epnhQfv/SxtmQ4SEvo79+rvkl7sS0=">()
         + s
         + iliIiIiiIi<"iliIiIiiIi","OUkbSPkmE87QMXx3hx/fFwGcSvZiokIMSkeG8FmrKm2UyaKg">()
         + t
         + iliIiIiiIi<"iliIiIiiIi","YdcgkMCuzhLZcEV/p0rWskMzMFJzVd/3Vlmf6pgJN0i7Ag==">()
         + (
            root == null
               ? iliIiIiiIi<"iliIiIiiIi","3cRoMv3MrXOQ0qioLCqmn6Jo1wT4lxSkHYkXVN4=">()
               : (root.iIlIlllllill() == null ? root.liiiIIllIl() : root.iIlIlllllill())
         );
      return root;
   }

   public int ilillIiill() {
      return this.lliIIIIIIi.size();
   }

   public Long Iilililiiili() {
      iiIlllIIllll var1 = null;

      for (iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (var3.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil && (var1 == null || var3.lIlliIIiiIlliIIi < var1.lIlliIIiiIlliIIi)) {
            var1 = var3;
         }
      }

      return var1 == null ? null : var1.llIilIIiilIilIIi;
   }

   public int lIliliIlil() {
      return this.iiiIIIIIIi;
   }

   public int lliIliliIl(long epoch, LongPredicate reconsider) {
      return this.iiiIlIIIll(epoch, r -> Long.MIN_VALUE, reconsider);
   }

   public int lililiilil() {
      return this.iIIlIIIIIi;
   }

   private static int[] liiiIIllIl(List<Long> members) {
      long var17 = 8603650993160332975L;
      long var19 = -8259632255507130324L;
      long var21 = -7330280950417803483L;
      long var13 = -4602716935841294748L;
      long var15 = -104913505299859802L;
      if (members.isEmpty()) {
         return new int[0];
      } else {
         var13 ^= (9223372032559808512L ^ var13) & -1L << 32;
         var13 ^= (2147483647L ^ var13) & -1L >>> 32;
         var15 ^= (9223372032559808512L ^ var15) & -1L << 32;
         var15 ^= (-2147483648L ^ var15) & -1L >>> 32;
         var17 ^= (Long.MIN_VALUE ^ var17) & -1L << 32;
         var17 ^= (-2147483648L ^ var17) & -1L >>> 32;

         for (long var8 : members) {
            var19 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var8) << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var8) ^ var19) & -1L >>> 32;
            var21 ^= ((long)llIiIiililIiIiil.Illlllllilll(var8) << 32 ^ var21) & -1L << 32;
            if ((int)(var19 >>> 32) < (int)(var13 >>> 32)) {
               var13 ^= ((long)((int)(var19 >>> 32)) << 32 ^ var13) & -1L << 32;
            }

            if ((int)(var19 >>> 32) > (int)var15) {
               var15 ^= ((long)((int)(var19 >>> 32)) ^ var15) & -1L >>> 32;
            }

            if ((int)var19 < (int)var13) {
               var13 ^= ((long)((int)var19) ^ var13) & -1L >>> 32;
            }

            if ((int)var19 > (int)(var17 >>> 32)) {
               var17 ^= ((long)((int)var19) << 32 ^ var17) & -1L << 32;
            }

            if ((int)(var21 >>> 32) < (int)(var15 >>> 32)) {
               var15 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var15) & -1L << 32;
            }

            if ((int)(var21 >>> 32) > (int)var17) {
               var17 ^= ((long)((int)(var21 >>> 32)) ^ var17) & -1L >>> 32;
            }
         }

         return new int[]{(int)(var13 >>> 32), (int)var13, (int)(var15 >>> 32), (int)var15, (int)(var17 >>> 32), (int)var17};
      }
   }

   public IIIllllIIlll iilllIIill(long root) {
      iiIlllIIllll var3 = this.lliIIIIIIi.get(root);
      return var3 == null ? null : var3.liiiIIllIl();
   }

   public int IIIillIIil(ilIiIlIlIiIiIlIl d) {
      long var5 = -1220818972759798937L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var4.illilIIiIililIIi == d) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public long IIIilIIiiIIi(long root) {
      iiIlllIIllll var3 = this.lliIIIIIIi.get(root);
      return var3 == null ? Long.MIN_VALUE : var3.iIIliIIiIlIliIIi;
   }

   public boolean Illillliilli(long stampKey, Collection<Long> epoch, long originKey, long members, long root, String reason) {
      long var21 = -1461968913987681215L;
      long var23 = 966681500006524982L;
      long var25 = -9145361673809352029L;
      long var27 = 7213412504886869492L;
      iiIlllIIllll var11 = this.lliIIIIIIi.get(stampKey);
      if (var11 == null) {
         if (this.lliIIIIIIi.size() >= 1024 && !this.ilIIiIiIIi()) {
            this.IIllIIIIIi++;
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
               + iIlIiIllIi(stampKey)
               + iliIiIiiIi<"iliIiIiiIi","CPbkFayJIGTcfzot8dV2S0LaqUGByoIQooTLLYZk8qzD1CqhEm0=">()
               + 1024
               + iliIiIiiIi<"iliIiIiiIi","hL+akmvUxPtu0tK8IxfdWLlizKE1coU2b133DUsW48Z6JZnxORBm3VzPPwTTvn1vvcJwHl51tcRcypzoaV92AD2ygAeLBpknroSLuGfRoqVNBg8pN/jwZpNe4L3av3uUfw==">();
            return false;
         } else {
            var11 = new iiIlllIIllll(stampKey, new ArrayList<>(), originKey);
            this.lliIIIIIIi.put(Long.valueOf(stampKey), var11);
            this.IiIlIIIIIi++;
            this.iIlIlllllill(var11, epoch);
            IlIlllIlilIl(var11, members);
            var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
            var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
            if (root != Long.MIN_VALUE) {
               var11.iIIliIIiIlIliIIi = root;
               var11.llIliIIiilIliIIi = new long[]{root};
            }

            var11.IllliIIilllliIIi = reason == null ? "" : reason;
            this.IiiIIIIIIi++;
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
               + iIlIiIllIi(stampKey)
               + iliIiIiiIi<"iliIiIiiIi","9djVaL5Vht6XzPqwllyWnbin2/nupVjVBL/8lJVoTiOGHQ==">()
               + this.lliIIIIIIi.size()
               + iliIiIiiIi<"iliIiIiiIi","iXUCtiOG16ESG5WbqphyAlc/s5Wrl2n3waXfNXeCnz+8RopT">()
               + var11.IllliIIilllliIIi;
            return true;
         }
      } else if (!var11.IliIlllilIi()) {
         if (epoch != null && !epoch.isEmpty() && !this.Iilllilliill(var11, epoch)) {
            var21 ^= ((long)this.Illlllllilll(var11, epoch) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)this.iIlIlllllill(var11, epoch) ^ var21) & -1L >>> 32;
            if ((int)(var21 >>> 32) != 0 && var11.iIlIiIIiIllIiIIi < 2) {
               var11.iIlIiIIiIllIiIIi++;
               var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
            }

            this.IiIlIIIIIi++;
            if ((int)var21 != 0 && var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil && !var11.IllilIIilllilIIi.isEmpty() && var11.lIIIiIIiiIIIiIIi < 2) {
               var11.lIIIiIIiiIIIiIIi++;
               var11.IllilIIilllilIIi.clear();
               IlIlllIlilIl(var11, Long.MIN_VALUE);
            }
         }

         if (var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil
            && var11.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl
            && originKey != var11.IIiilIIilIiilIIi) {
            var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var11.IIiilIIilIiilIIi = originKey;
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
               + iIlIiIllIi(stampKey)
               + iliIiIiiIi<"iliIiIiiIi","9yXyeBDDRLO+NFgjAeFc67aCKCxgP5pQhxRpdckmWYLtyT2whui6qdKtmBzO5UNFXVbP">()
               + reason
               + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
            this.IiIlIIIIIi++;
            return true;
         } else {
            return var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil;
         }
      } else {
         var21 ^= ((long)(members != Long.MIN_VALUE && var11.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && members != var11.lIiIiIIiiIiIiIIi ? 1 : 0) << 32 ^ var21)
            & -1L << 32;
         var21 ^= ((long)(epoch != null && !epoch.isEmpty() && this.Illlllllilll(var11, epoch) ? 1 : 0) ^ var21) & -1L >>> 32;
         var23 ^= (
               (long)(
                        root != Long.MIN_VALUE
                              && var11.iIIliIIiIlIliIIi != Long.MIN_VALUE
                              && root != var11.iIIliIIiIlIliIIi
                              && !iliIiiliiiii(var11.llIliIIiilIliIIi, root)
                              && var11.llIliIIiilIliIIi.length < 4
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var23
            )
            & -1L << 32;
         var23 ^= ((long)((int)(var21 >>> 32) == 0 && (int)var21 == 0 && (int)(var23 >>> 32) == 0 ? 0 : 1) ^ var23) & -1L >>> 32;
         String var16 = (int)(var21 >>> 32) != 0
            ? iliIiIiiIi<"iliIiIiiIi","mVHNJzSr4m5OUmnLkwObRNUCQtiB30+rYHpViHiM9XHVqhXedjuRpH4MkWIDYU1A3kv/yEBMJ6oMMU/j/K2cHVdGuQ+pTnU3pOOflIQM2RIHvQ==">()
            : (
               (int)var21 != 0
                  ? iliIiIiiIi<"iliIiIiiIi","V+pfjujj3SD2tNgJJGtwwFqYNaXsYGMbyFZOP3/uBBD0gSjBL8rc2CTzSGaaiZrxRMDC">()
                  : (
                     (int)(var23 >>> 32) != 0
                        ? iliIiIiiIi<"iliIiIiiIi","yy0QJSSeENVGDkJi+I748WdIq5PKdMDYntdo7mfR+YxVpwe7rPMq4HCnD2Q7bdLY5/bYJxcN8BA=">()
                           + (var11.llIliIIiilIliIIi.length + 1)
                           + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                           + 4
                           + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">()
                        : ""
                  )
            );
         iiiIlIIiIIIllIIi var17 = var11.iiIilIIiIIlilIIi;
         if (var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil) {
            if ((int)var23 == 0 && originKey == var11.IIiilIIilIiilIIi) {
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
                  + iIlIiIllIi(stampKey)
                  + iliIiIiiIi<"iliIiIiiIi","TXza2lqy0KkC2X79Vp8fwEiEWLFUYl9kbAuUVRTvkvahQ9O8gRWXdlFL0dCgWCw=">()
                  + var11.iiIilIIiIIlilIIi
                  + iliIiIiiIi<"iliIiIiiIi","mY7CLoS1DzRHC25f/Mntpy2XeYz3I29ruerYYIT5l/fS+r59/yGW51X1wa1T6uZQGd/GvckfVftVcMj8qWv9w0WCiLfw2Q==">();
               return false;
            } else {
               String var18;
               if ((int)var23 != 0) {
                  if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && !this.IIillIiliIil(var11)) {
                     if ((int)var21 != 0) {
                        var11.IilIiIIililIiIIi = new ArrayList<>(epoch);
                        var11.iilIiIIiIIiIiIIi = root;
                     }

                     if ((int)(var21 >>> 32) != 0) {
                        var11.liiIiIIiiiiIiIIi = members;
                        var11.iliIiIIiIiiIiIIi = -1L;
                     }

                     this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","MlB6h/3O2kmO0zCMa+XtVDydQ4SX7govc6COgstCO6s1FSJC3P8Ai7bkVdOSMCqjW5TW">()
                        + iIlIiIllIi(stampKey)
                        + iliIiIiiIi<"iliIiIiiIi","+Vu5MjKkeyYqjPb0Uh5FvE+I1p2ix3zdhL1Q6XvUrJZuCQ==">()
                        + (
                           (int)(var21 >>> 32) != 0
                              ? iliIiIiiIi<"iliIiIiiIi","LWfep2e8ED6Nqp0Q4bp0kPpsRXGOrK92aktkqKo/zSveVIeWU7m15ts8YY8=">()
                              : iliIiIiiIi<"iliIiIiiIi","sbkOFpfMz9vgZOO4t+YztbshlMH/2irgpRH4dy0E4mkQzJyOULF2zoowpycoleM=">()
                        )
                        + iliIiIiiIi<"iliIiIiiIi","nUfI33AzoxIEsqTSGjlhRbQ0P9KdsqqTTZQiCJpcFetuAeVkxRIOce4=">()
                        + var11.iiiilIIiIIIIiIIi
                        + iliIiIiiIi<"iliIiIiiIi","rPg5NlKmzLgVywVz8JMbB9L7k4seonfs1PAJ7R0NjAKlhS26UsEQCxgqRHJlW4RxhA8ZmiMYFF1YaJvr6KLosmyOx1S7M5w6OfbdZlBEzR49i5ojAqqcfzu/P6HlBe7silncgiIftwOawARTrMdy1TMdw3FzMShZsJjRCr2OZnUGx7Et">();
                     return false;
                  }

                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
                  if ((int)(var21 >>> 32) != 0 || (int)var21 != 0) {
                     var11.iiiilIIiIIIIiIIi++;
                     var11.ilIIiIIiIiIIiIIi = 0;
                     var11.llIliIIiilIliIIi = root != Long.MIN_VALUE ? new long[]{root} : new long[0];
                  } else if ((int)(var23 >>> 32) != 0) {
                     var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
                  }

                  var11.IiiilIIiliiilIIi = 0;
                  var11.IlIIiIIillIIiIIi = 0;
                  var18 = iliIiIiiIi<"iliIiIiiIi","Jq65+U/nGs5prS9PNRqUZZl7MW0kfCB3rGaNAowJNT7pQm1LenJ3">()
                     + var16
                     + iliIiIiiIi<"iliIiIiiIi","tctuQJvf0oqSniN6EvYELkWE/mNqhfjTM8eJwWiqFh6Si7yaOGWVEuodJFaaTYmn5igzEOOx9l6Q">()
                     + (
                        (int)(var21 >>> 32) != 0
                           ? iliIiIiiIi<"iliIiIiiIi","gogfkJ3Cz8CVgWk3ahKp+dkDeaHRv/XdTYMFczXsS2zEUqWlKwmfR2hXucU=">()
                              + var11.iiiilIIiIIIIiIIi
                              + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">()
                           : ""
                     );
               } else {
                  if (++var11.IiiilIIiliiilIIi > 3) {
                     var25 ^= ((long)(var11.IiiilIIiliiilIIi == 4 ? 1 : 0) << 32 ^ var25) & -1L << 32;
                     if ((int)(var25 >>> 32) != 0) {
                        this.iIllIIIIIi++;
                     }

                     this.iiIlIIIIIi = (
                           (int)(var25 >>> 32) != 0
                              ? iliIiIiiIi<"iliIiIiiIi","Ac30oQZ7/Mt2zpkzIe+N+cBcaYi1oj1Nwq6IzWIw+03kggba75kyzAhxgA==">()
                              : iliIiIiiIi<"iliIiIiiIi","oxFR0ClGiQXd91BB8Xs2DEK2waSor93bDufd1IDZN2zTK2I=">()
                        )
                        + iliIiIiiIi<"iliIiIiiIi","r86cb3PIpZaebeEbPPtt5ZR7HcerUKAjMa3oobWm3HVdYwqM">()
                        + iIlIiIllIi(stampKey)
                        + iliIiIiiIi<"iliIiIiiIi","Y88GlPj5pTOc9QS0+MSumwF4McGSnmBYPzbJWGMLb8sJm6PVZohqs3ctPnSkMCggYBJaSQ==">()
                        + 3
                        + iliIiIiiIi<"iliIiIiiIi","8XzYrxYOELTYzNkzUaWOTy6rqaeWHfSaZy7kVH+/7bqJ+FXQuJFDyPahgfZedDKSoxmp8fr/6qv+iYpf9tXz+GswyP99qZTVwvYjBpAxUMdljoRSmNEP/d1ipzBDI6xwyaucY4o66vEjHYB6BtYOysRt2aOnrm64yUY6UPhf9gqogt6bTql9oRpul6s5TgfKSG69AWwDFCBcqWc6qHWxkmToksLHyk6cXzSxvmVqlFOyG2KsAFX0ttpcVAznJbU=">();
                     return false;
                  }

                  var18 = iliIiIiiIi<"iliIiIiiIi","aQdWfSgdLdRG66QqhdcqZIN39xnIyJ/taY2y93dmFXJLK+fSEPLrZ64PbroemOztVRmfa6pFuHAwWDgiri+oSbFpzznBH7xrLJt8bXyZdUrPXER3+/fwaQoZuzzw">()
                     + var11.IiiilIIiliiilIIi
                     + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                     + 3
                     + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
               }

               this.iIlIlllllill(var11, (Collection<Long>)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi));
               var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var11.IllilIIilllilIIi.clear();
               var11.lIlilIIiiIlilIIi = null;
               var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var11.lililIIiiililIIi = 0L;
               var11.lliilIIiiliilIIi = 0;
               var11.lIIIiIIiiIIIiIIi = 0;
               var11.IIlIiIIilIlIiIIi = 0;
               var11.iIlIiIIiIllIiIIi = 0;
               var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
               if ((int)var23 == 0) {
                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               }

               var11.IIiilIIilIiilIIi = originKey;
               IlIlllIlilIl(var11, members);
               if (root != Long.MIN_VALUE) {
                  var11.iIIliIIiIlIliIIi = root;
               }

               var11.IllliIIilllliIIi = var18
                  + iliIiIiiIi<"iliIiIiiIi","titoNtxaY6WeJsmm/ljl5KMSvsZ6ThsMAalKeLA2">()
                  + reason
                  + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
                  + iIlIiIllIi(stampKey)
                  + iliIiIiiIi<"iliIiIiiIi","9djVaL5Vht6XzPqwllyWnbin2/nupVjVBL/8lJVoTiOGHQ==">()
                  + this.lliIIIIIIi.size()
                  + iliIiIiiIi<"iliIiIiiIi","iXUCtiOG16ESG5WbqphyAlc/s5Wrl2n3waXfNXeCnz+8RopT">()
                  + var11.IllliIIilllliIIi;
               this.IlIlIIIIIi++;
               this.IiIlIIIIIi++;
               return true;
            }
         } else {
            var25 ^= (
                  (long)(
                        (int)var21 == 0 && epoch != null && !epoch.isEmpty() && epoch.size() < Math.min(var11.IiIilIIiliIilIIi.size(), var11.lllIiIIiillIiIIi)
                           ? 1
                           : 0
                     )
                     ^ var25
               )
               & -1L >>> 32;
            if ((int)var23 == 0 && (int)var25 == 0) {
               if (++var11.lliilIIiiliilIIi > 2) {
                  var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                  var11.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                  var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  this.lIIlIIIIIi++;
                  var11.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","Wn2X3y8izFGt9tXwpNuU7SMdW+8tV41FJhOaX+erNyMVYU29">()
                     + var17
                     + iliIiIiiIi<"iliIiIiiIi","8MRMksPOihQCknw0LJT+0Iim2DW8vSZWas3za61VgulNKs/OfMxKBDHT">()
                     + var11.lliilIIiiliilIIi
                     + iliIiIiiIi<"iliIiIiiIi","XULE6z5Ty0zGSI8P89rSTvO/Yt3IFp+bRo8JI7HcLcU32UrDqdFuG3jn1iGTmbn066kddEq6Dd4wCscg">()
                     + reason
                     + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                  var11.IIiilIIilIiilIIi = originKey;
                  var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                  this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
                     + iIlIiIllIi(stampKey)
                     + iliIiIiiIi<"iliIiIiiIi","JRXkIWuWFag3UD/dUXeDQxEWszQJswdNxx0ewXAscT9yTzpWoFKanMjeZyrL0BEM">()
                     + var11.IllliIIilllliIIi
                     + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                  this.IiIlIIIIIi++;
                  return false;
               } else {
                  if (this.iIlIlllllill(var11, (Collection<Long>)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi))) {
                     IlIlllIlilIl(var11, Long.MIN_VALUE);
                  }

                  var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
                  var11.lIlilIIiiIlilIIi = null;
                  var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  var11.lililIIiiililIIi = 0L;
                  var11.IIiilIIilIiilIIi = originKey;
                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
                  var11.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","Wn2X3y8izFGt9tXwpNuU7SMdW+8tV41FJhOaX+erNyMVYU29">()
                     + var17
                     + iliIiIiiIi<"iliIiIiiIi","tvxV5R2ezhPmzb6+Z8iORnGqhhYgHSJOw3b3JiQ3rrhOaOP2DD5gPJF9ITmsTzmwyzMQKZN301/+E3BfUUj4ccET+QpEKRXqU296hJJuJOA=">()
                     + var11.lliilIIiiliilIIi
                     + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                     + 2
                     + iliIiIiiIi<"iliIiIiiIi","VYkl0JuP9GmCGh1Cy2qXnR13ddCU5vY/FX6SuC9bbw==">()
                     + reason;
                  this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
                     + iIlIiIllIi(stampKey)
                     + iliIiIiiIi<"iliIiIiiIi","9djVaL5Vht6XzPqwllyWnbin2/nupVjVBL/8lJVoTiOGHQ==">()
                     + this.lliIIIIIIi.size()
                     + iliIiIiiIi<"iliIiIiiIi","iXUCtiOG16ESG5WbqphyAlc/s5Wrl2n3waXfNXeCnz+8RopT">()
                     + var11.IllliIIilllliIIi;
                  this.IlIlIIIIIi++;
                  this.IiIlIIIIIi++;
                  return true;
               }
            } else {
               var25 ^= (
                     (long)(var11.IIlIiIIilIlIiIIi >= 2 && this.IlIlIIIIIi - var11.IliIiIIilliIiIIi < 1L << Math.min(var11.IIlIiIIilIlIiIIi, 12) ? 0 : 1) << 32
                        ^ var25
                  )
                  & -1L << 32;
               var27 ^= (0L ^ var27) & -1L << 32;
               if ((int)var25 != 0) {
                  var16 = (var16.isEmpty() ? "" : var16 + iliIiIiiIi<"iliIiIiiIi","sWvQ9tYQB96MCbFXHa3VXu7bSjW9ERyjVx93hdQ23Q==">())
                     + (var11.IiIilIIiliIilIIi.size() - epoch.size())
                     + iliIiIiiIi<"iliIiIiiIi","+u3oZuRwdFwhfHAC16oNzz+cZdYgFFR2NHJAOaM2BxIEAJ93cgUEnsNM7HHndMUgJX3Ed9nYaqAe64YPiX3J1aongSqKNOFDOWrkWnG4T//Z">();
               } else if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && (int)(var25 >>> 32) == 0) {
                  if (++var11.lliilIIiiliilIIi > 2) {
                     var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                     var11.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                     var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     this.lIIlIIIIIi++;
                     var11.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","Wn2X3y8izFGt9tXwpNuU7SMdW+8tV41FJhOaX+erNyMVYU29">()
                        + var17
                        + iliIiIiiIi<"iliIiIiiIi","8MRMksPOihQCknw0LJT+0Iim2DW8vSZWas3za61VgulNKs/OfMxKBDHT">()
                        + var11.lliilIIiiliilIIi
                        + iliIiIiiIi<"iliIiIiiIi","rFYkVvX0M0LYc6tboNjVa8fxK6EdBc82Gwu7fiXpIX+NsAu7Gk4k7XAgFuUwcUmjkwN/JZrvaXYI0kfSOiXlPJ5x7eciJoZ1WgvANBrMQ0HjtnkTW2ZcRBY=">()
                        + reason
                        + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                     var11.IIiilIIilIiilIIi = originKey;
                     var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                     var11.lIiIiIIiiIiIiIIi = members;
                     var11.iliIiIIiIiiIiIIi = -1L;
                     var11.liiIiIIiiiiIiIIi = Long.MIN_VALUE;
                     if (root != Long.MIN_VALUE && !iliIiiliiiii(var11.llIliIIiilIliIIi, root) && var11.llIliIIiilIliIIi.length < 4) {
                        var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
                     }

                     if ((int)var21 != 0) {
                        var11.IilIiIIililIiIIi = new ArrayList<>(epoch);
                        var11.iilIiIIiIIiIiIIi = root;
                     }

                     this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
                        + iIlIiIllIi(stampKey)
                        + iliIiIiiIi<"iliIiIiiIi","JRXkIWuWFag3UD/dUXeDQxEWszQJswdNxx0ewXAscT9yTzpWoFKanMjeZyrL0BEM">()
                        + var11.IllliIIilllliIIi
                        + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                     this.IiIlIIIIIi++;
                     return false;
                  }

                  var16 = var16
                     + iliIiIiiIi<"iliIiIiiIi","Acs+WW+TtNpaOGY1Qz2tXAEjCs8YDys9JTzh1rgmm6wCB/uUFbmrtPBefyX4EfDCmss9upJTybzjqSzdr8k/f/pi+73whwAVtUf4WlYRxCmm5no=">()
                     + var11.lliilIIiiliilIIi
                     + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                     + 2;
               } else if ((int)(var21 >>> 32) != 0 || (int)var21 != 0) {
                  var11.lliilIIiiliilIIi = 0;
                  var27 ^= (4294967296L ^ var27) & -1L << 32;
               }

               if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && (int)var25 == 0) {
                  var11.IIlIiIIilIlIiIIi++;
               }

               this.iIlIlllllill(var11, (Collection<Long>)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi));
               var11.lllIiIIiillIiIIi = (int)(var27 >>> 32) != 0
                  ? var11.IiIilIIiliIilIIi.size()
                  : Math.min(var11.lllIiIIiillIiIIi, var11.IiIilIIiliIilIIi.size());
               var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var11.IllilIIilllilIIi.clear();
               var11.lIlilIIiiIlilIIi = null;
               var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var11.lililIIiiililIIi = 0L;
               var11.IiiilIIiliiilIIi = 0;
               var11.lIIIiIIiiIIIiIIi = 0;
               var11.IlIIiIIillIIiIIi = 0;
               var11.IilIiIIililIiIIi = null;
               var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               if ((int)(var27 >>> 32) != 0 || (int)var25 != 0 && (int)(var21 >>> 32) != 0) {
                  var11.ilIIiIIiIiIIiIIi = 0;
                  var11.llIliIIiilIliIIi = root != Long.MIN_VALUE ? new long[]{root} : new long[0];
               } else if (root != Long.MIN_VALUE && !iliIiiliiiii(var11.llIliIIiilIliIIi, root) && var11.llIliIIiilIliIIi.length < 4) {
                  var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
               }

               var11.IIiilIIilIiilIIi = originKey;
               IlIlllIlilIl(var11, members);
               if (root != Long.MIN_VALUE) {
                  var11.iIIliIIiIlIliIIi = root;
               }

               var11.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","Jq65+U/nGs5prS9PNRqUZZl7MW0kfCB3rGaNAowJNT7pQm1LenJ3">()
                  + var16
                  + iliIiIiiIi<"iliIiIiiIi","75BRrP23TV1cCCvNiVs2JYbIOx/mXgeOIrJWmuCtU4V96R0rfenP">()
                  + var17
                  + iliIiIiiIi<"iliIiIiiIi","gPEe0YvbSrRUAx0vmPs+GNt+p1+S7q4eKEIjtm1XajLa+R1qn4Y=">()
                  + reason
                  + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","BpImaeXz9csGmLzojuLscfQJTwfmIb54HL337fAn6ZHYWxGAni5JfbgJAA==">()
                  + iIlIiIllIi(stampKey)
                  + iliIiIiiIi<"iliIiIiiIi","9djVaL5Vht6XzPqwllyWnbin2/nupVjVBL/8lJVoTiOGHQ==">()
                  + this.lliIIIIIIi.size()
                  + iliIiIiiIi<"iliIiIiiIi","iXUCtiOG16ESG5WbqphyAlc/s5Wrl2n3waXfNXeCnz+8RopT">()
                  + var11.IllliIIilllliIIi;
               this.IlIlIIIIIi++;
               this.IiIlIIIIIi++;
               return true;
            }
         }
      }
   }

   public IiilliIlliilliIl llIililIil(long root, long lapseKey, String why) {
      this.IiIlIIIIIi++;
      iiIlllIIllll var6 = this.lliIIIIIIi.get(root);
      if (var6 == null || var6.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.iiIiilliil) {
         return null;
      } else if (var6.ilIIiIIiIiIIiIIi >= 2) {
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
            + iIlIiIllIi(root)
            + iliIiIiiIi<"iliIiIiiIi","/nwLNbZMA1UPnl+j/+9Lk7B8faFoej2XgGZOXiqghAJMQ5I0SRyTJvCnGLM39/R8NuMXlUsIJTniPtVXZkwRmD2K65wC4tYBqG1y7eTksQ==">()
            + 2
            + iliIiIiiIi<"iliIiIiiIi","rn061FQD0WBZ60sPIfBexaMMUZH65ha9N11EdfJuA2Oi3SEfoo7nEA9CbLKtTCcYR1oVWgoJDw==">();
         return null;
      } else {
         var6.ilIIiIIiIiIIiIIi++;
         iiiIlIIiIIIllIIi var7 = var6.iiIilIIiIIlilIIi;
         var6.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.ilIiilliil;
         var6.illilIIiIililIIi = ilIiIlIlIiIiIlIl.ilIiIIIiIl;
         var6.lililIIiiililIIi = lapseKey;
         var6.IllilIIilllilIIi.clear();
         var6.lIIIiIIiiIIIiIIi = 0;
         var6.lIlilIIiiIlilIIi = null;
         var6.IllliIIilllliIIi = why == null ? "" : why;
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","xrnO52cjuxqtRpfEBSImyZh+BTHKcgkVEXu+yseIDpntOOXiyYxFut1V8H3NhjXnisgm">()
            + iIlIiIllIi(root)
            + iliIiIiiIi<"iliIiIiiIi","iQZVPSCvdNaRMXjLmznMCZ9KKxyzH0iguDeUxTjh2177nVIBW3rkIHULx83Ei/FY9Z+fHw7DfuVUZgM6ptUa">()
            + lapseKey
            + iliIiIiiIi<"iliIiIiiIi","titoNtxaY6WeJsmm/ljl5KMSvsZ6ThsMAalKeLA2">()
            + var6.ilIIiIIiIiIIiIIi
            + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
            + 2
            + iliIiIiiIi<"iliIiIiiIi","kgQ3p3V6/OhJYpwycUY1GJrcyjRRt0Xy75EeZiT1">()
            + var6.IllliIIilllliIIi
            + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
         return new IiilliIlliilliIl(var7, var6.iiIilIIiIIlilIIi, null, var6.IllliIIilllliIIi);
      }
   }

   public boolean IIlilIliiIli(long epoch, Collection<Long> members, long reason, long root, String stampKey) {
      return this.Illillliilli(epoch, members, reason, root, Long.MIN_VALUE, stampKey);
   }

   private boolean iIlIlllllill(iiIlllIIllll members, Collection<Long> e) {
      int[] var3 = members.IiIliIIiliIliIIi;

      for (long var5 : members.IiIilIIiliIilIIi) {
         this.ilIlIIIIIi.remove(var5, members.llIilIIiilIilIIi);
      }

      members.IiIilIIiliIilIIi = new ArrayList<>(e);

      for (long var9 : members.IiIilIIiliIilIIi) {
         Long var7 = this.ilIlIIIIIi.put(var9, members.llIilIIiilIilIIi);
         if (var7 != null && var7 != members.llIilIIiilIilIIi) {
            this.IilliliilIIi(var7, var9);
         }
      }

      members.IiIliIIiliIliIIi = liiiIIllIl(members.IiIilIIiliIilIIi);
      return !Arrays.equals(var3, members.IiIliIIiliIliIIi);
   }

   public iiiIlIIiIIIllIIi lIilliIill(long root) {
      iiIlllIIllll var3 = this.lliIIIIIIi.get(root);
      return var3 == null ? null : var3.iiIilIIiIIlilIIi;
   }

   private static lIllIIIiiIllIIIi IlIIillIIi(iiIlllIIllll e) {
      long var5 = 3671375783079041716L;
      lIllIIIiiIllIIIi[] var1 = IllIililllIili.liiiIIllIl();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIllIIIiiIllIIIi var4 = var1[(int)var8];
         if (var4 == lIllIIIiiIllIIIi.iilIlIliil) {
            break;
         }

         if (!e.IllilIIilllilIIi.contains(var4)) {
            return var4;
         }
      }

      return null;
   }

   public List<IIIllllIIlll> lliililiil() {
      ArrayList var1 = new ArrayList();

      for (iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int Iillllilll(boolean completionMissionActive, boolean materialAvailable, boolean serviceMissionActive, boolean banLive, boolean planInFlight) {
      long var10 = 132894678276075828L;
      this.IiIlIIIIIi++;
      var10 ^= (0L ^ var10) & -1L << 32;

      for (iiIlllIIllll var8 : this.lliIIIIIIi.values()) {
         byte var10000;
         label63: {
            label52:
            if ((var8.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.IlIiilliil || banLive)
               && (var8.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.llIiilliil || completionMissionActive)) {
               if (var8.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil) {
                  switch (var8.illilIIiIililIIi) {
                     case lIIiIIIiIl:
                        if (!completionMissionActive) {
                           break label52;
                        }
                        break;
                     case ilIiIIIiIl:
                        if (!materialAvailable) {
                           break label52;
                        }
                        break;
                     case IlIiIIIiIl:
                        if (serviceMissionActive) {
                           break label52;
                        }
                        break;
                     case IIIiIIIiIl:
                        if (!completionMissionActive && !materialAvailable) {
                           break label52;
                        }
                        break;
                     case iIIiIIIiIl:
                        if (!planInFlight) {
                           break label52;
                        }
                        break;
                     default:
                        break label52;
                  }
               }

               var10000 = 0;
               break label63;
            }

            var10000 = 1;
         }

         var10 ^= ((long)var10000 ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var8.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var8.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","nYOJ9+Eb/7m1ZsNHKjh0OoXRPsXbtATGAp9cJuwjVuG66W20kvU+Ac4Y3ZQ6n49DURKk3w==">();
            var10 += 4294967296L;
         }
      }

      if ((int)(var10 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","7Ftwerq7ji+uHrioWdCYwupMNguEvqEA26mQURNO64zhLStqn5CQD3uhtJFV">() + (int)(var10 >>> 32);
      }

      return (int)(var10 >>> 32);
   }

   public int[] Ililllililil(long root) {
      iiIlllIIllll var3 = this.lliIIIIIIi.get(root);
      return var3 == null ? new int[0] : (var3.iiIliIIiIIlliIIi.length == 6 ? (int[])var3.iiIliIIiIIlliIIi.clone() : (int[])var3.IiIliIIiliIliIIi.clone());
   }

   public int IIiIllIiIl(ilIiIlIlIiIiIlIl dep) {
      long var5 = -8614609888405152375L;
      this.IiIlIIIIIi++;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var4.illilIIiIililIIi == dep) {
            var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var4.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","UB4bdrJpHszARsNb/Wnig+1UQO9vgYBOYrVGMmt0D4F56rk=">()
               + dep
               + iliIiIiiIi<"iliIiIiiIi","WA+a0FzVKNiq6vy4QY9Ej3pacaKphJHI9Q5CglBn67eqyXz3dbKzFEXc">();
            var5 += 4294967296L;
         }
      }

      if ((int)(var5 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","l4/u8RpG15Bg5mvsKbujatBHMJ6ZgVhAsiU4bGss3HvTirxynpg5kcdqdOI=">()
            + dep
            + iliIiIiiIi<"iliIiIiiIi","l7uIq07RJcf4+XUAwU17Yb86lcrdPERJfvolS2VXdQgFUjaqLWc=">()
            + (int)(var5 >>> 32);
      }

      return (int)(var5 >>> 32);
   }

   public List<Long> IIlllIlliIll() {
      if (this.liIlIIIIIi.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList<>(this.liIlIIIIIi);
         this.liIlIIIIIi.clear();
         return var1;
      }
   }

   public IiilliIlliilliIl IiIIlliIIl(long waitOn, lIllIIIiiIllIIIi strategy, lIliiIiliIliiIil epoch, ilIiIlIlIiIiIlIl root, long r, long dependencyKey) {
      iiIlllIIllll var10 = this.lliIIIIIIi.get(waitOn);
      if (var10 == null) {
         return null;
      } else {
         this.IlIlIIIIIi++;
         if (var10.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.IlIiilliil && dependencyKey != Long.MIN_VALUE) {
            var10.IIiilIIilIiilIIi = dependencyKey;
         }

         if (var10.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.IlIiilliil) {
            this.lIllIIIIIi++;
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","xrnO52cjuxqtRpfEBSImyZh+BTHKcgkVEXu+yseIDpntOOXiyYxFut1V8H3NhjXnisgm">()
               + iIlIiIllIi(waitOn)
               + iliIiIiiIi<"iliIiIiiIi","yukPX4uYYeC6hq5+HvZAd4epnhQfv/SxtmQ4SEvo79+rvkl7sS0=">()
               + strategy
               + iliIiIiiIi<"iliIiIiiIi","OUkbSPkmE87QMXx3hx/fFwGcSvZiokIMSkeG8FmrKm2UyaKg">()
               + epoch
               + iliIiIiiIi<"iliIiIiiIi","SIxESY6BjpW1D/ukQ2+EQbB/97CQS9qKTz7Kk9q++s7FmaYFy5ng3xweiJyvTNYrBOuKv7lNyQ==">()
               + var10.iiIilIIiIIlilIIi
               + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
            return null;
         } else {
            this.IiIlIIIIIi++;
            iiiIlIIiIIIllIIi var11 = var10.iiIilIIiIIlilIIi;
            if (strategy != null) {
               var10.IllilIIilllilIIi.add(strategy);
            }

            switch (epoch) {
               case IilililIil:
                  var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.llIiilliil;
                  var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.lIIiIIIiIl;
                  var10.lililIIiiililIIi = r;
                  var10.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","WtTpkCxLKJHnxLEJQubDcCq4QGu8vAKdgUTsHGH0WE9k4WVjcn2aCOLkeLw=">()
                     + r
                     + iliIiIiiIi<"iliIiIiiIi","sP1Ja8gMgmqQGb7RIzwgTE2VAoYHkMtCyfRST8P/GImb0f/aLE4jcjz2npGcq2Gtbuc=">();
                  return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, null, var10.IllliIIilllliIIi));
               case lilililIil:
                  var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.liIiilliil;
                  var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  this.IIIlIIIIIi++;
                  var10.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                  var10.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","gLwODFRL0ThZi8S+wlFPp08NNzo0PR6uCOJzj/mJDfUbDf87aPsao0ZCvHFCc7F7s1DKo7P48g==">();
                  this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
                     + iIlIiIllIi(waitOn)
                     + iliIiIiiIi<"iliIiIiiIi","4DdC2yOqcViU2YKc8t/zkBhCw8mjHQleVFLI/hqbIfuiX8x9RIPQLEmv+ksi">();
                  return new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, null, var10.IllliIIilllliIIi);
               case IIiililIil:
                  if (root != null && root != ilIiIlIlIiIiIlIl.IIIiIIIiIl) {
                     var10.IllilIIilllilIIi.remove(strategy);
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.ilIiilliil;
                     var10.illilIIiIililIIi = root;
                     var10.lililIIiiililIIi = r;
                     var10.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","ya8/fuImLnooXY+OUWCzxeCiOTI/dl+1qFRq7+2jNsSFIhB2V73sTQ==">() + root;
                     return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, strategy, var10.IllliIIilllliIIi));
                  }

                  return this.llIIlilIIl(waitOn, strategy, lIliiIiliIliiIil.lilililIil, ilIiIlIlIiIiIlIl.IIIiIIIiIl, 0L);
               default:
                  lIllIIIiiIllIIIi var12 = IlIIillIIi(var10);
                  if (var12 == null) {
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                     var10.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                     var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     this.lIIlIIIIIi++;
                     var10.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                     var10.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","JIlyvMN6IAPFt240TL1FlZ6WcWvWgwPK3sHZG6+9I5IFgcLVpBPpRLQcM0U2suVccF1gRdHpDmzfdZSqSLcckUhzx4+hsmOx1ig=">()
                        + var10.IIiilIIilIiilIIi
                        + iliIiIiiIi<"iliIiIiiIi","+i375yZ3TKofULMhlBYN6v/ef7g54MzXN/s0j1KNSCSh06c=">()
                        + strategy
                        + iliIiIiiIi<"iliIiIiiIi","A0mBUF3yMw+cGk6mhfPBJWbIi4HQKQTWtE5Bz0LmoJE=">()
                        + epoch
                        + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                     this.lIIIiiIIIi(waitOn, strategy, epoch, null);
                     this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
                        + iIlIiIllIi(waitOn)
                        + iliIiIiiIi<"iliIiIiiIi","JRXkIWuWFag3UD/dUXeDQxEWszQJswdNxx0ewXAscT9yTzpWoFKanMjeZyrL0BEM">()
                        + var10.IllliIIilllliIIi
                        + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
                     return new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, null, var10.IllliIIilllliIIi);
                  } else {
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
                     var10.lIlilIIiiIlilIIi = null;
                     var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     var10.IllliIIilllliIIi = strategy
                        + iliIiIiiIi<"iliIiIiiIi","A0mBUF3yMw+cGk6mhfPBJWbIi4HQKQTWtE5Bz0LmoJE=">()
                        + epoch
                        + iliIiIiiIi<"iliIiIiiIi","4NXGDNkh4onQv5ByrCyW7Xr2+ySsjwbxKGMpP+S0u6Dq2iU=">()
                        + var12;
                     return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, var12, var10.IllliIIilllliIIi));
                  }
            }
         }
      }
   }

   public int IlIllllIll(long forceDeferred, long reconsider, LongUnaryOperator stampOf, LongPredicate admitDeferred, boolean epoch, boolean topologyRev) {
      long var33 = -8844016998617352190L;
      long var35 = 8120789200950455294L;
      long var37 = -290323042541594497L;
      long var39 = -8735667382787084725L;
      long var41 = 7445773742820142004L;
      long var29 = -566422507455829499L;
      long var31 = -3999572360216592322L;
      this.IiIlIIIIIi++;
      this.IlIlIIIIIi++;
      this.llIlIIIIIi++;
      var29 ^= (0L ^ var29) & -1L << 32;
      var29 ^= (0L ^ var29) & -1L >>> 32;
      var31 ^= (0L ^ var31) & -1L << 32;
      long var12 = 0L;

      for (iiIlllIIllll var15 : this.lliIIIIIIi.values()) {
         if (!var15.IiIilIIiliIilIIi.isEmpty()) {
            var31 ^= ((long)(var15.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var15.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl ? 1 : 0) ^ var31)
               & -1L >>> 32;
            var33 ^= (0L ^ var33) & -1L << 32;
            var33 ^= (0L ^ var33) & -1L >>> 32;
            var35 ^= (0L ^ var35) & -1L << 32;
            var35 ^= (0L ^ var35) & -1L >>> 32;
            var37 ^= (0L ^ var37) & -1L << 32;
            long var22 = Long.MIN_VALUE;
            if (var15.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil) {
               if (reconsider >= 0L && var15.iliIiIIiIiiIiIIi == reconsider) {
                  var22 = var15.liiIiIIiiiiIiIIi;
               } else {
                  var22 = stampOf.applyAsLong(var15.llIilIIiilIilIIi);
                  var15.liiIiIIiiiiIiIIi = var22;
                  var15.iliIiIIiIiiIiIIi = reconsider;
               }

               var37 ^= ((long)(var22 != Long.MIN_VALUE && var15.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && var22 != var15.lIiIiIIiiIiIiIIi ? 1 : 0) << 32 ^ var37)
                  & -1L << 32;
               if (var15.IilIiIIililIiIIi != null) {
                  this.lIiiIiIlilli(var15);
               }

               var35 ^= ((long)(var15.IilIiIIililIiIIi != null ? 1 : 0) << 32 ^ var35) & -1L << 32;
               var37 ^= ((long)((int)(var37 >>> 32) == 0 && (int)(var35 >>> 32) == 0 ? 0 : 1) ^ var37) & -1L >>> 32;
               var39 ^= (0L ^ var39) & -1L << 32;
               var39 ^= (0L ^ var39) & -1L >>> 32;
               var41 ^= (0L ^ var41) & -1L << 32;
               if ((int)var37 != 0 && !this.IIillIiliIil(var15)) {
                  var41 ^= ((long)(epoch && this.llIlIIIIIi - var15.IIIliIIilIIliIIi >= 1L << Math.min(var15.iiiilIIiIIIIiIIi, 12) ? 1 : 0) ^ var41)
                     & -1L >>> 32;
                  var35 ^= ((long)((int)var41 == 0 && topologyRev && var15.liIIiIIiiiIIiIIi < 2 ? 1 : 0) ^ var35) & -1L >>> 32;
                  var41 ^= ((long)((int)var41 == 0 && (int)var35 == 0 ? 0 : 1) << 32 ^ var41) & -1L << 32;
                  if ((int)(var41 >>> 32) == 0) {
                     var39 ^= ((long)(var15.IlIIiIIillIIiIIi < 3 && admitDeferred.test(var15.llIilIIiilIilIIi) ? 1 : 0) << 32 ^ var39) & -1L << 32;
                     var39 ^= (1L ^ var39) & -1L >>> 32;
                     if ((int)(var39 >>> 32) == 0) {
                        var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32;
                        var12 = var15.llIilIIiilIilIIi;
                        if ((int)(var35 >>> 32) != 0) {
                           var31 += 4294967296L;
                        }
                        continue;
                     }

                     var37 ^= (0L ^ var37) & -1L >>> 32;
                     var35 ^= (0L ^ var35) & -1L << 32;
                  }
               }

               if ((int)var39 == 0 && (int)var37 == 0) {
                  var39 ^= ((long)(var15.IlIIiIIillIIiIIi < 3 && admitDeferred.test(var15.llIilIIiilIilIIi) ? 1 : 0) << 32 ^ var39) & -1L << 32;
               }

               var33 ^= ((long)((int)(var39 >>> 32) != 0 && (int)var37 == 0 ? 1 : 0) ^ var33) & -1L >>> 32;
               var33 ^= ((long)((int)var37 == 0 && (int)var33 == 0 ? 0 : 1) << 32 ^ var33) & -1L << 32;
               if ((int)(var41 >>> 32) != 0) {
                  var15.IIIliIIilIIliIIi = this.llIlIIIIIi;
               }

               if ((int)var35 != 0) {
                  var15.liIIiIIiiiIIiIIi++;
               }
            }

            if ((int)var31 != 0 || (int)(var33 >>> 32) != 0) {
               if ((int)(var33 >>> 32) != 0) {
                  if ((int)var33 != 0) {
                     var15.IlIIiIIillIIiIIi++;
                     if ((int)(var37 >>> 32) != 0) {
                        var15.lliilIIiiliilIIi = 0;
                        var15.ilIIiIIiIiIIiIIi = 0;
                        var15.llIliIIiilIliIIi = var15.iIIliIIiIlIliIIi != Long.MIN_VALUE ? new long[]{var15.iIIliIIiIlIliIIi} : new long[0];
                     }
                  } else {
                     var15.iiiilIIiIIIIiIIi++;
                     var15.IlIIiIIillIIiIIi = 0;
                     var15.lliilIIiiliilIIi = 0;
                     var15.ilIIiIIiIiIIiIIi = 0;
                     var15.llIliIIiilIliIIi = var15.iIIliIIiIlIliIIi != Long.MIN_VALUE ? new long[]{var15.iIIliIIiIlIliIIi} : new long[0];
                  }
               }

               if ((int)(var35 >>> 32) != 0) {
                  this.iIlIlllllill(var15, var15.IilIiIIililIiIIi);
                  if (var15.iilIiIIiIIiIiIIi != Long.MIN_VALUE) {
                     var15.iIIliIIiIlIliIIi = var15.iilIiIIiIIiIiIIi;
                     var15.llIliIIiilIliIIi = new long[]{var15.iilIiIIiIIiIiIIi};
                  }

                  var15.IilIiIIililIiIIi = null;
                  var15.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               }

               var15.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var15.IllilIIilllilIIi.clear();
               var15.lIlilIIiiIlilIIi = null;
               var15.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var15.IIiilIIilIiilIIi = forceDeferred;
               var15.IiiilIIiliiilIIi = 0;
               var15.lIIIiIIiiIIIiIIi = 0;
               var15.IIlIiIIilIlIiIIi = 0;
               var15.iIlIiIIiIllIiIIi = 0;
               var15.lllIiIIiillIiIIi = var15.IiIilIIiliIilIIi.size();
               if ((int)(var35 >>> 32) != 0) {
                  IlIlllIlilIl(var15, Long.MIN_VALUE);
               } else if (var22 != Long.MIN_VALUE) {
                  IlIlllIlilIl(var15, var22);
               }

               var15.IllliIIilllliIIi = (int)var33 != 0
                  ? iliIiIiiIi<"iliIiIiiIi","Yhv4v3Tw+Jm1rGhFMALbs53YzT/vH/VrJDvBnAb3R93Wkncmi4FH0L0VxxUNIlmsyb98XUog49GctE6YtsiM8F/h1Kt+Bu6qwFMJ7tEIyC7P50wYNQIWB7IEmfVks/Z0oQ==">()
                     + var15.IlIIiIIillIIiIIi
                     + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                     + 3
                     + (
                        (int)(var37 >>> 32) != 0
                           ? iliIiIiiIi<"iliIiIiiIi","ATGeSXaZ+I520/UIQo16hOslF9juZCp2/RHvhhi6lMHX9sQHHX+5BTi37bB9sntGai2ZO4Lb2CjQ4reuD6GSxA==">()
                           : ""
                     )
                     + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">()
                  : (
                     (int)(var33 >>> 32) != 0
                        ? iliIiIiiIi<"iliIiIiiIi","qZP1UquUmf9rlXKHImnneyQCAPrAwC0nVjOF7pwLBHUJEEpAsKuFRu1cXbvI6Q==">()
                           + (
                              (int)(var35 >>> 32) != 0
                                 ? iliIiIiiIi<"iliIiIiiIi","sbkOFpfMz9vgZOO4t+YztbshlMH/2irgpRH4dy0E4mkQzJyOULF2zoowpycoleM=">()
                                 : iliIiIiiIi<"iliIiIiiIi","RnYZpp/dXZaoiSjTjjoLrkHs3us8N+23J+GfKDx1JBEmpxFG7wEb7jLFlfz+jSrQPy8Dhqv4qpziE8Jv+rq2fL6pAND8ZQMb5S3+gQfY">()
                           )
                           + iliIiIiiIi<"iliIiIiiIi","gogfkJ3Cz8CVgWk3ahKp+dkDeaHRv/XdTYMFczXsS2zEUqWlKwmfR2hXucU=">()
                           + var15.iiiilIIiIIIIiIIi
                           + (
                              (int)var35 != 0
                                 ? iliIiIiiIi<"iliIiIiiIi","/X1vzGIr/GfXYxOxDnYQLT5p729uAHImV9Vint/7yA635wq96nx0y1xCSKP/QeM/nj63fN0L">()
                                    + var15.liIIiIIiiiIIiIIi
                                    + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                                    + 2
                                 : (
                                    epoch && this.llIlIIIIIi == var15.IIIliIIilIIliIIi
                                       ? iliIiIiiIi<"iliIiIiiIi","pDEjSb7lJDFqSmAUhVy/sWlPYCxRvm+n+x8aInFUY3EFIz1ljYG7x0PbgiThaOFpdSZCiv2rKw8BCLVwWOw=">()
                                       : ""
                                 )
                           )
                           + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">()
                        : iliIiIiiIi<"iliIiIiiIi","seqeqeTJAaa54ST3YPMZoPgI+VGEy41OYC56yWgOAEvDEMCeFOOogxP4CJI02Ja86Wg/VBR6OcpQgHimJbR0m+s=">()
                  );
               var29 += 4294967296L;
            }
         }
      }

      if ((int)(var29 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","MRx0TK+pCz7vQunvxuWNrCACNo/Kx823nza9TrtZ32FDw9DwAmIKeXU404CAJkVOfm5eJlV9/DsWtFE=">() + (int)(var29 >>> 32);
      } else if ((int)var29 > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","MlB6h/3O2kmO0zCMa+XtVDydQ4SX7govc6COgstCO6s1FSJC3P8Ai7bkVdOSMCqjW5TW">()
            + iIlIiIllIi(var12)
            + (
               (int)var29 > 1
                  ? iliIiIiiIi<"iliIiIiiIi","7+VbCBtv2a6eEbUdGOPXxUFr8DEMsTImwdsgyStPow==">()
                     + ((int)var29 - 1)
                     + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">()
                  : ""
            )
            + iliIiIiiIi<"iliIiIiiIi","+Vu5MjKkeyYqjPb0Uh5FvE+I1p2ix3zdhL1Q6XvUrJZuCQ==">()
            + (
               (int)(var31 >>> 32) == (int)var29
                  ? iliIiIiiIi<"iliIiIiiIi","sbkOFpfMz9vgZOO4t+YztbshlMH/2irgpRH4dy0E4mkQzJyOULF2zoowpycoleM=">()
                  : (
                     (int)(var31 >>> 32) > 0
                        ? iliIiIiiIi<"iliIiIiiIi","RU7a67kDiU4KxRFFbsoTpq4JecpYwSJ9S/FCTBJG/YdpA9ZjK8keEBPoBXA2nnUt6ps8Kd1oa1AL+4oYa3PXJzljVod2Vxk=">()
                        : iliIiIiiIi<"iliIiIiiIi","LWfep2e8ED6Nqp0Q4bp0kPpsRXGOrK92aktkqKo/zSveVIeWU7m15ts8YY8=">()
                  )
            )
            + iliIiIiiIi<"iliIiIiiIi","4PO6/oQrCBMaDEpM4FzLFe5jtGPnxT4T/LnNjBvO6+0viK3d20axvwQylZWPVmOoGiVdHGnWBeJOKhWEGuIsqo1ljcIIKrkhWW52aGZVMY2kXCQAH7Px9mee/FDIOEER0FicZzpf0Gn3cbv3a73cXSZ9fprCX9vJo6/yZXPXal02DUbO4dEVlLyWnciY4xkLxTZqb1DosRzF">();
      }

      return (int)(var29 >>> 32);
   }

   public Long IIiilIiiiIii(LongPredicate preferred) {
      iiIlllIIllll var2 = null;

      for (iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil
            && preferred.test(var4.llIilIIiilIilIIi)
            && (var2 == null || var4.lIlliIIiiIlliIIi < var2.lIlliIIiiIlliIIi)) {
            var2 = var4;
         }
      }

      return var2 == null ? null : var2.llIilIIiilIilIIi;
   }

   public boolean ilIllIiIll(boolean serviceMissionActive, boolean materialAvailable, boolean completionMissionActive) {
      return this.liIlliiIll(serviceMissionActive, materialAvailable, completionMissionActive, true);
   }

   public int IIlIilIlIi() {
      return this.lIllIIIIIi;
   }

   public lIllIIIiiIllIIIi Iiiiliiiiiii(long root, long epoch) {
      return this.iIIIlIlIIl(root, epoch, r -> Long.MIN_VALUE, Long.MIN_VALUE);
   }

   public boolean IlIillIiilIi() {
      for (iiIlllIIllll var2 : this.lliIIIIIIi.values()) {
         if (var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil
            || var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.IlIiilliil
            || var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil) {
            return false;
         }
      }

      return true;
   }

   public int iiiIlIIIll(long stampOf, LongUnaryOperator reconsider, LongPredicate epoch) {
      return this.lIIlliIIll(stampOf, -1L, reconsider, epoch, false);
   }

   public String iiiilIIIIi() {
      return String.format(
         Locale.ROOT,
         iliIiIiiIi<"iliIiIiiIi","9g42dMOILlOJt8wN/hw09X/Aqwpb6zHC7+HjjBNIuztWiv1RBKlHtF0vXK1J5hPlVA1h0JF66eqP+rhn0kwTrgpvkhU/GI1mZuyPucqBzy3NpfBY6XQcIKRvRD/XKeJBeAn2uf2VlM8XKtX0EQueG+FGKGjuyWmDv1rG0x3MaBsY2RATvrX4tR6HvftdDCPT6nGSip8D2MBzdL9po5EUwLTQCbNgtdaRkZvG36KYrfSL8iicB9iufDqBHQeGmvrYQdlOzP4DzKAYxj2bLG26FXx+gJpUuvc+">(),
         this.lliIIIIIIi.size(),
         this.Ilillllill(),
         this.liilliiill(iiiIlIIiIIIllIIi.iIIiilliil),
         this.liilliiill(iiiIlIIiIIIllIIi.IlIiilliil),
         this.liilliiill(iiiIlIIiIIIllIIi.llIiilliil),
         this.liilliiill(iiiIlIIiIIIllIIi.ilIiilliil),
         this.iiiIIIIIIi,
         this.IIIlIIIIIi,
         this.lIIlIIIIIi,
         this.liiIIIIIIi,
         this.iIIlIIIIIi,
         this.IIllIIIIIi,
         this.lIllIIIIIi,
         this.iIllIIIIIi
      );
   }

   private boolean ilIIiIiIIi() {
      for (Map.Entry var2 : this.lliIIIIIIi.entrySet()) {
         iiiIlIIiIIIllIIi var3 = ((iiIlllIIllll)var2.getValue()).iiIilIIiIIlilIIi;
         if (var3 == iiiIlIIiIIIllIIi.IiIiilliil || var3 == iiiIlIIiIIIllIIi.liIiilliil) {
            this.IiIlliIliiIl((Long)var2.getKey());
            return true;
         }
      }

      for (Map.Entry var6 : this.lliIIIIIIi.entrySet()) {
         if (((iiIlllIIllll)var6.getValue()).IliIlllilIi() && ((iiIlllIIllll)var6.getValue()).IilIiIIililIiIIi == null) {
            this.IiIlliIliiIl((Long)var6.getKey());
            return true;
         }
      }

      for (Map.Entry var7 : this.lliIIIIIIi.entrySet()) {
         if (((iiIlllIIllll)var7.getValue()).IliIlllilIi()) {
            this.IiIlliIliiIl((Long)var7.getKey());
            return true;
         }
      }

      return false;
   }

   public int iIiIlIliIl(long epoch) {
      return this.lliIliliIl(epoch, r -> true);
   }

   public int IiIilliIil() {
      return this.IiiIIIIIIi;
   }

   private boolean IIillIiliIil(iiIlllIIllll e) {
      return e.iiiilIIiIIIIiIIi < 2 || this.IlIlIIIIIi - e.IliIiIIilliIiIIi >= 1L << Math.min(e.iiiilIIiIIIIiIIi, 12);
   }

   public IiilliIlliilliIl illIlIilIl(long why, String root) {
      this.IiIlIIIIIi++;
      iiIlllIIllll var4 = this.lliIIIIIIi.get(why);
      if (var4 != null && !var4.IliIlllilIi()) {
         iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
         var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
         var4.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
         var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
         this.lIIlIIIIIi++;
         var4.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var4.IllliIIilllliIIi = root == null ? "" : root;
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
            + iIlIiIllIi(why)
            + iliIiIiiIi<"iliIiIiiIi","JRXkIWuWFag3UD/dUXeDQxEWszQJswdNxx0ewXAscT9yTzpWoFKanMjeZyrL0BEM">()
            + var4.IllliIIilllliIIi
            + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
         return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, null, var4.IllliIIilllliIIi);
      } else {
         return null;
      }
   }

   public IiilliIlliilliIl llIIlilIIl(long strategy, lIllIIIiiIllIIIi waitOn, lIliiIiliIliiIil root, ilIiIlIlIiIiIlIl r, long dependencyKey) {
      return this.IiIIlliIIl(strategy, waitOn, root, r, dependencyKey, Long.MIN_VALUE);
   }

   private void IilliliilIIi(long otherRoot, long member) {
      iiIlllIIllll var5 = this.lliIIIIIIi.get(otherRoot);
      if (var5 != null) {
         var5.IiIilIIiliIilIIi.remove(member);
         var5.IiIliIIiliIliIIi = liiiIIllIl(var5.IiIilIIiliIilIIi);
         if (var5.IiIilIIiliIilIIi.isEmpty()) {
            if (!var5.IliIlllilIi()) {
               this.iiiIIIIIIi++;
            }

            var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
            var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var5.iiIliIIiIIlliIIi = new int[0];
            var5.IilIiIIililIiIIi = null;
            var5.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
            var5.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","G6f00nttyuS9wOneMfqTvFdV2b9fgJgAiGxiyW+rR8R0IFtLjYioBAMg2X1Fkm7K6b+4qQ4/9JqNoRkhQvv9InAW/YZCSaBx/Q==">();
         }
      }
   }

   public lIllIIIiiIllIIIi IIIIllIIIl(long root, long stampKey, long epoch) {
      return this.iIIIlIlIIl(root, stampKey, stampKeyx -> epoch, Long.MIN_VALUE);
   }

   private boolean Illlllllilll(iiIlllIIllll members, Collection<Long> e) {
      for (long var4 : e) {
         Long var6 = this.ilIlIIIIIi.get(var4);
         if (var6 == null || var6 != members.llIilIIiilIilIIi) {
            return true;
         }
      }

      return false;
   }

   public boolean IiIiliIiiiIi(long epoch, Collection<Long> members, long root, String reason) {
      return this.IIlilIliiIli(epoch, members, root, Long.MIN_VALUE, reason);
   }

   private static void IlIlllIlilIl(iiIlllIIllll key, long e) {
      key.lIiIiIIiiIiIiIIi = e;
      key.iliIiIIiIiiIiIIi = -1L;
      key.liiIiIIiiiiIiIIi = Long.MIN_VALUE;
      key.iiIliIIiIIlliIIi = (int[])key.IiIliIIiliIliIIi.clone();
   }

   public boolean IIllllIlll(boolean banLive, boolean materialAvailable, boolean serviceMissionActive, boolean completionMissionActive, boolean planInFlight) {
      long var9 = 607243538082020806L;
      var9 ^= (0L ^ var9) & -1L << 32;

      for (iiIlllIIllll var8 : this.lliIIIIIIi.values()) {
         if (!var8.IliIlllilIi()) {
            var9 ^= (4294967296L ^ var9) & -1L << 32;
            switch (var8.iiIilIIiIIlilIIi) {
               case liIiilliil:
                  return false;
               case IiIiilliil:
                  if (completionMissionActive) {
                     return false;
                  }
                  break;
               case IlIiilliil:
                  if (banLive) {
                     return false;
                  }
                  break;
               case llIiilliil:
                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.lIIiIIIiIl && banLive) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.iIIiIIIiIl && materialAvailable) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.IlIiIIIiIl && !serviceMissionActive) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl && (banLive || materialAvailable)) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.ilIiIIIiIl && planInFlight) {
                     return false;
                  }
            }
         }
      }

      if ((int)(var9 >>> 32) != 0) {
         this.iIIlIIIIIi++;
      }

      return (boolean)((int)(var9 >>> 32));
   }

   public int illilIilil() {
      return this.lIIlIIIIIi;
   }

   public Long Iiilliiliiil(long member) {
      return this.ilIlIIIIIi.get(member);
   }

   public String iIiilIliil() {
      return this.iiIlIIIIIi;
   }

   public boolean Iliilliiilii() {
      return this.Iilililiiili() != null;
   }

   public int lllllillll(boolean materialAvailable, boolean serviceMissionActive, boolean completionMissionActive, boolean planInFlight) {
      return this.Iillllilll(materialAvailable, serviceMissionActive, completionMissionActive, planInFlight, false);
   }

   public liIlIlIiiiIlIlIi() {
      this.ilIlIIIIIi = new HashMap<>();
      this.liIlIIIIIi = new ArrayList<>();
      this.iiIlIIIIIi = "";
   }

   public static String iIlIiIllIi(long packed) {
      return llIiIiililIiIiil.IiIlliIliiIl(packed)
         + iliIiIiiIi<"iliIiIiiIi","KkSpgSdPNBZWjnSBLRSIxj+4gQxKtnoIIR/zjzM=">()
         + llIiIiililIiIiil.IIlllIlliIll(packed)
         + iliIiIiiIi<"iliIiIiiIi","KkSpgSdPNBZWjnSBLRSIxj+4gQxKtnoIIR/zjzM=">()
         + llIiIiililIiIiil.Illlllllilll(packed);
   }

   private static long[] IIIllIIliIIl(long[] a, long v) {
      long[] var3 = Arrays.copyOf(a, a.length + 1);
      var3[a.length] = v;
      return var3;
   }

   public long IliIlllilIi() {
      return this.IiIlIIIIIi;
   }

   public int iIIilIlIil() {
      long var4 = -1404801913284982193L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (var3.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil
            && (
               var3.IilIiIIililIiIIi != null
                  || var3.liiIiIIiiiiIiIIi != Long.MIN_VALUE && var3.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && var3.liiIiIIiiiiIiIIi != var3.lIiIiIIiiIiIiIIi
            )) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public IiilliIlliilliIl lIlIliIlIl(long dependencyKey) {
      this.IiIlIIIIIi++;

      for (iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil && var4.lililIIiiililIIi == dependencyKey) {
            iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
            if (var4.lIlilIIiiIlilIIi != null) {
               var4.IllilIIilllilIIi.remove(var4.lIlilIIiiIlilIIi);
            }

            var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var4.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","WtTpkCxLKJHnxLEJQubDcCq4QGu8vAKdgUTsHGH0WE9k4WVjcn2aCOLkeLw=">()
               + dependencyKey
               + iliIiIiiIi<"iliIiIiiIi","+bP1zDN5rRpJlWtw29oDeZIm2oqq8EhpM3CJSLQrT+PH61RGYOmumcJzXb35b7ttMhzBVCYh/y0Im4/TS6u1sy9hoaFpYyO3foSPnTWoWZKx8TaV67lu">();
            this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","xrnO52cjuxqtRpfEBSImyZh+BTHKcgkVEXu+yseIDpntOOXiyYxFut1V8H3NhjXnisgm">()
               + iIlIiIllIi(var4.llIilIIiilIilIIi)
               + iliIiIiiIi<"iliIiIiiIi","yukPX4uYYeC6hq5+HvZAd4epnhQfv/SxtmQ4SEvo79+rvkl7sS0=">()
               + var4.lIlilIIiiIlilIIi
               + iliIiIiiIi<"iliIiIiiIi","RK+jFvsrasOe2XWcEIU43DrAW0EMi6Y+usyL9H+HIgsDuP3UBvVT2qs4beAfWA+o524wsO+kL18MdUk=">()
               + IlIIillIIi(var4);
            return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, IlIIillIIi(var4), var4.IllliIIilllliIIi);
         }
      }

      this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","HUG7tPC1M5WsgCzkx27C24Ur5fhnNWpGGP7MVdpRdrh2gKcO">()
         + dependencyKey
         + iliIiIiiIi<"iliIiIiiIi","nqIk13Xa4+zd+EmZSEDWeJvwFs8zuSCTQsE5R+7Cz+MU4h3vrimpNoWJ4QD/UNWGh0XkU2dazzMyV/VB67nOyBqukcdfNn9AcNAFfP+2fajamtwZo1YV1oIOKEgKgGIMVW/t">();
      return null;
   }

   public void Iiiilliiil() {
      this.IiIlIIIIIi++;
      this.lliIIIIIIi.clear();
      this.ilIlIIIIIi.clear();
      this.iliIIIIIIi = 0L;
      this.IlIlIIIIIi = 0L;
      this.llIlIIIIIi = 0L;
      this.IiiIIIIIIi = this.liiIIIIIIi = this.iiiIIIIIIi = this.IIIlIIIIIi = this.lIIlIIIIIi = this.iIIlIIIIIi = this.IIllIIIIIi = this.lIllIIIIIi = this.iIllIIIIIi = 0;
      this.iiIlIIIIIi = "";
   }

   private boolean Iilllilliill(iiIlllIIllll e, Collection<Long> members) {
      return members.size() == e.IiIilIIiliIilIIi.size() && !this.Illlllllilll(e, members);
   }

   public int Ilillllill() {
      long var4 = -6228455942784671131L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (!var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public int IiiIlliiIl(long reconsider, long stampKey, LongPredicate epoch) {
      return this.iiiIlIIIll(reconsider, r -> stampKey, epoch);
   }

   public int IIiillIiil() {
      return this.iIllIIIIIi;
   }

   public int iIlllIllll(boolean serviceMissionActive, boolean completionMissionActive, boolean materialAvailable) {
      return this.lllllillll(serviceMissionActive, completionMissionActive, materialAvailable, true);
   }

   public int Illillllil() {
      return this.IIIlIIIIIi;
   }

   public int liilliiill(iiiIlIIiIIIllIIi s) {
      long var5 = -760980445290189704L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == s) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public int lIIlliIIll(long topologyRev, long stampOf, LongUnaryOperator reconsider, LongPredicate epoch, boolean admitDeferred) {
      return this.IlIllllIll(topologyRev, stampOf, reconsider, epoch, admitDeferred, false);
   }

   public lIllIIIiiIllIIIi iIIIlIlIIl(long root, long stampOf, LongUnaryOperator originKey, long epoch) {
      long var17 = 7341151347105642119L;
      long var19 = 4445178491265058276L;
      this.IiIlIIIIIi++;
      iiIlllIIllll var8 = this.lliIIIIIIi.get(root);
      if (var8 != null && var8.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil) {
         var17 ^= (
               (long)(
                        epoch != Long.MIN_VALUE
                              && var8.iIIliIIiIlIliIIi != Long.MIN_VALUE
                              && epoch != var8.iIIliIIiIlIliIIi
                              && !var8.IllilIIilllilIIi.isEmpty()
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var17
            )
            & -1L << 32;
         if (epoch != Long.MIN_VALUE && (var8.IllilIIilllilIIi.isEmpty() || (int)(var17 >>> 32) != 0 && var8.lIIIiIIiiIIIiIIi < 2)) {
            var8.iIIliIIiIlIliIIi = epoch;
            if (!iliIiiliiiii(var8.llIliIIiilIliIIi, epoch) && var8.llIliIIiilIliIIi.length < 4) {
               var8.llIliIIiilIliIIi = IIIllIIliIIl(var8.llIliIIiilIliIIi, epoch);
            }
         }

         if (var8.IllilIIilllilIIi.isEmpty()) {
            var8.iiIliIIiIIlliIIi = (int[])var8.IiIliIIiliIliIIi.clone();
         }

         long var10 = originKey.applyAsLong(root);
         String var12 = "";
         if (var10 != Long.MIN_VALUE) {
            if (var8.IllilIIilllilIIi.isEmpty() || var8.lIiIiIIiiIiIiIIi == Long.MIN_VALUE) {
               IlIlllIlilIl(var8, var10);
            } else if ((var10 != var8.lIiIiIIiiIiIiIIi || (int)(var17 >>> 32) != 0) && var8.lIIIiIIiiIIIiIIi < 2) {
               var8.lIIIiIIiiIIIiIIi++;
               var8.IllilIIilllilIIi.clear();
               var8.iiIliIIiIIlliIIi = (int[])var8.IiIliIIiliIliIIi.clone();
               IlIlllIlilIl(var8, originKey.applyAsLong(root));
               var12 = iliIiIiiIi<"iliIiIiiIi","juyEOxRwAXaNjMj60FJcPh9OfpYyHP7iuamWzeTOa4clKyo/x1gnJV+YozhRrgv199yd">()
                  + (
                     (int)(var17 >>> 32) != 0
                        ? iliIiIiiIi<"iliIiIiiIi","ntl4ai1hLt/pMkwN4duVYjMzVEgkGMwQLA4U2ZHSPzIY4fgn4cBahC1M/OBfi7v6nQo0ZpTmkI9E">()
                        : iliIiIiiIi<"iliIiIiiIi","LWfep2e8ED6Nqp0Q4bp0kPpsRXGOrK92aktkqKo/zSveVIeWU7m15ts8YY8=">()
                  )
                  + iliIiIiiIi<"iliIiIiiIi","0RBKuKwNJuWn4rWmKO3DwW1aspRYXLRM29NjspFA8oYtXrhlPgfI">()
                  + var8.lIIIiIIiiIIIiIIi
                  + iliIiIiiIi<"iliIiIiiIi","r1ThcI9qtoWPLAU008hp8SSYTyCWSdSPYcHKgIU=">()
                  + 2
                  + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
            }
         }

         var8.lIlliIIiiIlliIIi = ++this.iliIIIIIIi;
         this.IlIlIIIIIi++;
         var8.iIiilIIiIliilIIi++;
         this.liiIIIIIIi++;
         lIllIIIiiIllIIIi[] var13 = IllIililllIili.liiiIIllIl();
         var17 ^= ((long)var13.length ^ var17) & -1L >>> 32;

         for (long var23 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var23 >>> 32) < (int)var17; var23 += 4294967296L) {
            lIllIIIiiIllIIIi var16 = var13[(int)(var23 >>> 32)];
            if (var16 == lIllIIIiiIllIIIi.iilIlIliil) {
               break;
            }

            if (!var8.IllilIIilllilIIi.contains(var16)) {
               var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IlIiilliil;
               var8.lIlilIIiiIlilIIi = var16;
               var8.IIiilIIilIiilIIi = stampOf;
               this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","WUGomzgjsiVe2mjgUHC356duQXCrDNUCCfkDm8KlWLRf05YZTY58rognc7w=">()
                  + iIlIiIllIi(root)
                  + iliIiIiiIi<"iliIiIiiIi","yukPX4uYYeC6hq5+HvZAd4epnhQfv/SxtmQ4SEvo79+rvkl7sS0=">()
                  + var16
                  + iliIiIiiIi<"iliIiIiiIi","7a/J8HJ5ih6HF+ekB1FevWj62w/UGuoPtOh7JL0N4e5IWYxLeYo=">()
                  + var8.iIiilIIiIliilIIi
                  + var12;
               return var16;
            }
         }

         var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
         var8.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
         var8.IIiilIIilIiilIIi = stampOf;
         var8.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var8.IllliIIilllliIIi = iliIiIiiIi<"iliIiIiiIi","JIlyvMN6IAPFt240TL1FlZ6WcWvWgwPK3sHZG6+9I5IFgcLVpBPpRLQcM0U2suVccF1gRdHpDmzfdZSqSLcckUhzx4+hsmOx1ig=">()
            + stampOf;
         this.lIIlIIIIIi++;
         this.iiIlIIIIIi = iliIiIiiIi<"iliIiIiiIi","2H5zrXOt1vwZD/dB3YDnQPXcv7vtX//wH4+FS13zoADrGPSEt7TSPnDoCbM=">()
            + iIlIiIllIi(root)
            + iliIiIiiIi<"iliIiIiiIi","JRXkIWuWFag3UD/dUXeDQxEWszQJswdNxx0ewXAscT9yTzpWoFKanMjeZyrL0BEM">()
            + var8.IllliIIilllliIIi
            + iliIiIiiIi<"iliIiIiiIi","aLN37pMmUIaL/HqdR1yNaJGgQ/v4GFMcf4Ldfuo=">();
         return null;
      } else {
         return null;
      }
   }

   public boolean liIlliiIll(boolean materialAvailable, boolean serviceMissionActive, boolean planInFlight, boolean completionMissionActive) {
      return this.IIllllIlll(materialAvailable, serviceMissionActive, planInFlight, completionMissionActive, false);
   }
}
