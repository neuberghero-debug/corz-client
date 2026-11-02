package gg.corz;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class iiIIIIliIIlIIIli {
   private int IiiiiIIlIi;
   private int lliiiIIlIi;
   private lliIllililiIllil lIIIIlIlIi;
   private final EnumMap<lliIllililiIllil, Integer> iIiiiIIlIi;
   private int liiiiIIlIi;
   public static final int IiliiIIlIi = 8;
   private final HashMap<Integer, Illlllllllllllll> IIiiiIIlIi;
   public static final int liliiIIlIi = 4096;
   private int iliiiIIlIi;
   private final LinkedHashMap<Integer, LinkedHashMap<Long, IiIiiiIlliIiiiIl>> iiliiIIlIi = new LinkedHashMap<>();
   private int IIIIIlIlIi;
   private int IliiiIIlIi;
   private int iiiiiIIlIi;
   private final HashSet<Integer> lIiiiIIlIi;

   private void IiIlliIliiIl(int deckY, long why, lliIllililiIllil top) {
      Map var5 = this.iiliiIIlIi.get(deckY);
      if (var5 != null) {
         var5.remove(why);
      }

      this.IIlllIlliIll(top);
   }

   public int Iilililiiili() {
      return this.lliiiIIlIi;
   }

   public lliIllililiIllil Illlllllilll() {
      return this.lIIIIlIlIi;
   }

   public void Iiilliiliiil(int cap, Illlllllllllllll deckY) {
      this.IIiiiIIlIi.put(cap, deckY);
      this.iiiiiIIlIi++;
   }

   public int llIIlilIIl(int deckY) {
      Map var2 = this.iiliiIIlIi.get(deckY);
      return var2 == null ? 0 : var2.size();
   }

   public void IIlilIliiIli(int deckY) {
      this.iiliiIIlIi.remove(Integer.valueOf(deckY));
      this.IIiiiIIlIi.remove(deckY);
      this.lIiiiIIlIi.remove(deckY);
   }

   public void Ililllililil(int deckY) {
      if (this.lIiiiIIlIi.remove(deckY)) {
         this.IIlllIlliIll(lliIllililiIllil.IIlIiliIil);
      }
   }

   public int IiIIlliIIl() {
      long var4 = 2431821551018355446L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (Map var3 : this.iiliiIIlIi.values()) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public String IllIllllIl() {
      return String.format(
         Locale.ROOT,
         illIlIilIl<"illIlIilIl","LJPoRGf38gBV1/awxSGFM2lhlCx8h75hnjufLF/9nFbxVo6Zw5fe5DNHQpgwhyzfT753TYQzN5NLGO6/p4gMXfly//F91MGH/Lmy0cjmJgMy3TrtvRvvQCsFikMINSL4TYJub75v7n34GCqLBedZK4lMzh+Bjnj8u8UuXpQgouG/GBcYiwR469NcNTCy/gAAMfNRfmCOm5/BDp3XRDOevhHsb00eLbqWv/kIYaScDNjPBll9bwY3Lns4X7yL/eXojYhxSyyeO6kHw5ZQx3efJO8GZS6VjlxxKulhhNKJZlCBJ7a2aNKggUOQowCmyTBVM5D1r9HZPjXYaPU1awSO93YuhA==">(),
         this.IliiiIIlIi,
         this.IiiiiIIlIi,
         this.lliiiIIlIi,
         this.iliiiIIlIi,
         this.IiIIlliIIl(),
         this.liiiiIIlIi,
         this.iiiiiIIlIi,
         this.IIIIllIIIl(lliIllililiIllil.IlIIiliIil),
         this.lIlIliIlIl()
      );
   }

   public iiIIIIliIIlIIIli() {
      this.IIiiiIIlIi = new HashMap<>();
      this.lIiiiIIlIi = new HashSet<>();
      this.iIiiiIIlIi = new EnumMap<>(lliIllililiIllil.class);
   }

   public IiIiiiIlliIiiiIl IilliliilIIi(int deckY, long top) {
      Map var4 = this.iiliiIIlIi.get(deckY);
      return var4 == null ? null : (IiIiiiIlliIiiiIl)var4.get(top);
   }

   public int Illillliilli() {
      return this.IliiiIIlIi;
   }

   public int Iiiiliiiiiii() {
      return this.liiiiIIlIi;
   }

   public IiIiiiIlliIiiiIl lIiiIiIlilli(int deckY, long ctx, iIIiIlllIlIiIlll top) {
      IiIiiiIlliIiiiIl var5 = this.IilliliilIIi(deckY, ctx);
      if (var5 == null) {
         return null;
      } else {
         lliIllililiIllil var6 = this.IlIlllIlilIl(deckY, ctx, var5, top, true);
         if (var6 == null) {
            this.lliiiIIlIi++;
            return this.IilliliilIIi(deckY, ctx);
         } else {
            this.IiIlliIliiIl(deckY, ctx, var6);
            return null;
         }
      }
   }

   public int IIiilIiiiIii() {
      return this.iliiiIIlIi;
   }

   public int Iliilliiilii() {
      return this.IiiiiIIlIi;
   }

   public void iIlIlllllill(int top, long originFeet, iIiIiIilIliIiIil base, long validUntil, long deckY, IiIlIiiliIlIii why, int column, int tick) {
      LinkedHashMap var12 = this.iiliiIIlIi.get(top);
      if (var12 == null) {
         var12 = new LinkedHashMap();
         this.iiliiIIlIi.put(Integer.valueOf(top), var12);

         while (this.iiliiIIlIi.size() > 8) {
            Iterator var13 = this.iiliiIIlIi.keySet().iterator();
            var13.next();
            var13.remove();
         }
      }

      if (var12.put(
            Long.valueOf(originFeet), new IiIiiiIlliIiiiIl(base, validUntil, deckY, why == null ? IiIlIiiliIlIii.IiIIiilIIl : why, column, Math.max(0, tick))
         )
         == null) {
         this.IliiiIIlIi++;
      }

      while (var12.size() > 4096) {
         Iterator var14 = var12.keySet().iterator();
         var14.next();
         var14.remove();
      }
   }

   public int IIIIllIIIl(lliIllililiIllil why) {
      return this.iIiiiIIlIi.getOrDefault(why, Integer.valueOf(0));
   }

   public void IIlllIlliIll(lliIllililiIllil why) {
      this.iIiiiIIlIi.merge(why, Integer.valueOf(1), Integer::sum);
      this.lIIIIlIlIi = why;
   }

   public void IiIiliIiiiIi() {
      this.IiiiiIIlIi++;
   }

   public Illlllllllllllll IIIilIIiiIIi(int deckY) {
      return this.IIiiiIIlIi.get(deckY);
   }

   private boolean IIIllIIliIIl(IiIiiiIlliIiiiIl p, iIIiIlllIlIiIlll ctx) {
      long var5 = -5876748120135134141L;
      if (p.IliIlllilIi() == iIiIiIilIliIiIil.IliiillIil) {
         return false;
      } else {
         IiIlIiiliIlIii var3 = p.IilliliilIIi();

         for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < var3.iliIiiliiiii().length; var7 += 4294967296L) {
            if (ctx.iliIiiliiiii().contentHash(var3.iliIiiliiiii()[(int)(var7 >>> 32)]) != var3.IIIllIIliIIl()[(int)(var7 >>> 32)]) {
               return true;
            }
         }

         return false;
      }
   }

   public void Iilllilliill(int deckY) {
      this.lIiiiIIlIi.add(deckY);
      this.liiiiIIlIi++;
   }

   public boolean IIillIiliIil(int deckY) {
      return this.lIiiiIIlIi.contains(deckY);
   }

   public void IlIillIiilIi(int now, Illlllllllllllll deckY) {
      Illlllllllllllll var3 = this.IIiiiIIlIi.remove(now);
      if (var3 != null) {
         this.IIlllIlliIll(var3.iIlIlllllill() != deckY.iIlIlllllill() ? lliIllililiIllil.IiIIiliIil : lliIllililiIllil.liIIiliIil);
      }
   }

   private lliIllililiIllil IlIlllIlilIl(int deckY, long ctx, IiIiiiIlliIiiiIl p, iIIiIlllIlIiIlll mayRecompute, boolean top) {
      long var10 = 1197950872529213214L;
      switch (p.IliIlllilIi()) {
         case liiiillIil:
            return null;
         case lliiillIil:
         case iliiillIil:
         case IIIIIilIil:
         default:
            break;
         case IliiillIil:
            if (mayRecompute.IliIlllilIi().test(p.liiiIIllIl())) {
               return lliIllililiIllil.IlIIiliIil;
            }
            break;
         case IiiiillIil:
         case iiiiillIil:
            if (mayRecompute.liiiIIllIl()
               ? !mayRecompute.IliIlllilIi().test(p.iIlIlllllill())
               : Math.abs(llIiIiililIiIiil.IIlllIlliIll(p.iIlIlllllill()) - mayRecompute.iIlIlllllill()) >= 2) {
               return lliIllililiIllil.iiIIiliIil;
            }
      }

      if (p.iliIiiliiiii() > 0 && mayRecompute.IilliliilIIi() >= p.iliIiiliiiii()) {
         return lliIllililiIllil.ilIIiliIil;
      } else if (!this.IIIllIIliIIl(p, mayRecompute)) {
         return null;
      } else if (!top) {
         return lliIllililiIllil.lIlIiliIil;
      } else {
         IiIlIiiliIlIii var7 = mayRecompute.lIiiIiIlilli().read(ctx, p.liiiIIllIl());
         this.iliiiIIlIi++;
         if (var7 == null) {
            return lliIllililiIllil.lIlIiliIil;
         } else if (var7.IilliliilIIi() != p.IilliliilIIi().IilliliilIIi()) {
            return lliIllililiIllil.llIIiliIil;
         } else if (var7.lIiiIiIlilli() != p.IilliliilIIi().lIiiIiIlilli()) {
            return lliIllililiIllil.ilIIiliIil;
         } else {
            long[] var8 = new long[p.IilliliilIIi().iliIiiliiiii().length];

            for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < var8.length; var12 += 4294967296L) {
               var8[(int)(var12 >>> 32)] = mayRecompute.iliIiiliiiii().contentHash(p.IilliliilIIi().iliIiiliiiii()[(int)(var12 >>> 32)]);
            }

            this.iiliiIIlIi
               .get(deckY)
               .put(
                  Long.valueOf(ctx),
                  new IiIiiiIlliIiiiIl(
                     p.IliIlllilIi(), p.liiiIIllIl(), p.iIlIlllllill(), p.IilliliilIIi().IliIlllilIi(var8), p.lIiiIiIlilli(), p.iliIiiliiiii()
                  )
               );
            return null;
         }
      }
   }

   public void liiiIIllIl(int tick, long top, iIiIiIilIliIiIil deckY, long column, long originFeet, IiIlIiiliIlIii base, int why) {
      this.iIlIlllllill(tick, top, deckY, column, originFeet, base, why, 0);
   }

   public String lIlIliIlIl() {
      long var6 = -6117646905415832223L;
      StringBuilder var1 = new StringBuilder(illIlIilIl<"illIlIilIl","R/uwJiW2jt4d5O38odHc2x6dFGe9AF9vD3pWmow=">());
      lliIllililiIllil[] var2 = lliIllililiIllil.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         lliIllililiIllil var5 = var2[(int)var9];
         if (var1.length() > 1) {
            var1.append(illIlIilIl<"illIlIilIl","7rQUVRnJA2B36bPKkaf1rR8NGC/OK/bCdmq4ywhE">());
         }

         var1.append(var5).append('=').append(this.iIiiiIIlIi.getOrDefault(var5, Integer.valueOf(0)));
      }

      return var1.append('}').toString();
   }

   public static long IliIlllilIi(long v) {
      v ^= v >>> 33;
      v *= -49064778989728563L;
      v ^= v >>> 33;
      v *= -4265267296055464877L;
      return v ^ v >>> 33;
   }

   public int iIIIlIlIIl() {
      long var4 = 3161379435598357327L;
      var4 ^= (0L ^ var4) & -1L << 32;
      Iterator var2 = this.iIiiiIIlIi.values().iterator();

      while (var2.hasNext()) {
         var4 ^= ((long)((Integer)var2.next()).intValue() ^ var4) & -1L >>> 32;
         var4 ^= ((long)((int)(var4 >>> 32) + (int)var4) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   public void iiIIlIIlIl() {
      this.iiliiIIlIi.clear();
      this.IIiiiIIlIi.clear();
      this.lIiiiIIlIi.clear();
      this.iIiiiIIlIi.clear();
      this.IliiiIIlIi = this.lliiiIIlIi = this.iliiiIIlIi = this.IiiiiIIlIi = this.liiiiIIlIi = this.iiiiiIIlIi = this.IIIIIlIlIi = 0;
      this.lIIIIlIlIi = null;
   }

   public List<Long> iliIiiliiiii(int ctx, List<Long> deckY, iIIiIlllIlIiIlll tops, int recomputeBudget) {
      long var16 = 2373750543042743445L;
      long var18 = -8177457407594451954L;
      long var20 = 6018995818045460979L;
      ArrayList var5 = new ArrayList();
      Map var6 = this.iiliiIIlIi.get(ctx);
      if (var6 != null && !deckY.isEmpty()) {
         var16 ^= ((long)deckY.size() << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)(this.IIIIIlIlIi % (int)(var16 >>> 32)) ^ var16) & -1L >>> 32;
         var18 ^= (0L ^ var18) & -1L << 32;

         for (long var25 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var25 < (int)(var16 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var20 ^= ((long)(((int)var16 + (int)var25) % (int)(var16 >>> 32)) << 32 ^ var20) & -1L << 32;
            long var12 = (Long)deckY.get((int)(var20 >>> 32));
            IiIiiiIlliIiiiIl var14 = (IiIiiiIlliIiiiIl)var6.get(var12);
            if (var14 != null) {
               if (this.IIIllIIliIIl(var14, tops)) {
                  if ((int)(var25 >>> 32) >= recomputeBudget) {
                     this.IIIIIlIlIi = (int)(var20 >>> 32);
                     return var5;
                  }

                  var25 += 4294967296L;
               }

               lliIllililiIllil var15 = this.IlIlllIlilIl(ctx, var12, var14, tops, true);
               if (var15 != null) {
                  this.IiIlliIliiIl(ctx, var12, var15);
                  var5.add(var12);
               }
            }
         }

         this.IIIIIlIlIi = 0;
         return var5;
      } else {
         return var5;
      }
   }
}
