package gg.corz;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2352;

public final class lliIIIliiliIIIli {
   private int IIIiIlIlIi;
   private lIlilliliIlillil iiIiIlIlIi;
   private final Map<Long, Integer> illiIlIlIi;
   private int llIiIlIlIi;
   private static final int iiilIlIlIi = 2;
   private int IiIiIlIlIi;
   private final Map<Long, Set<String>> iiliIlIlIi;
   private int lIliIlIlIi;
   private final Set<Long> lIiiIlIlIi;
   private int llliIlIlIi;
   private lilIIliilIIl iliiIlIlIi;
   private int IliiIlIlIi;
   private int IlliIlIlIi;
   private lIIiililiIIiilil lliiIlIlIi;
   private final Set<Long> liliIlIlIi;
   private final ArrayDeque<liiiIIIiiiiiIIIi> IIiiIlIlIi;
   private final Iiiiliiliiilii lIIiIlIlIi;
   private static final int IiilIlIlIi = 2;
   private static final int llilIlIlIi = 3;
   private final iillllilIIilllil iIIiIlIlIi = new iillllilIIilllil();
   private boolean iIliIlIlIi;
   private static final int liilIlIlIi = 8192;
   private int IIliIlIlIi;
   private int IlIiIlIlIi;
   private final Map<Long, Integer> iIiiIlIlIi;
   private static final int ililIlIlIi = 2;
   private lIIiililiIIiilil IiiiIlIlIi;
   private boolean liIiIlIlIi;
   private int ilIiIlIlIi;
   private final Set<Long> IiliIlIlIi;

   private class_2338 IIillIiliIil(lilIIliilIIl w, int bandHi, int bandLo) {
      long var10 = 3379541748023219912L;
      long var12 = 2407592946305490519L;
      long var14 = -6200035486366414639L;
      var10 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var10) & -1L >>> 32;
      var12 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var12) & -1L << 32;

      for (long var19 = var12 ^ ((long)bandHi ^ var12) & -1L >>> 32; (int)var19 <= bandLo; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         for (var14 ^= ((long)((int)var10) << 32 ^ var14) & -1L << 32; (int)(var14 >>> 32) <= (int)(var19 >>> 32); var14 += 4294967296L) {
            class_2338 var9 = this.lliIliliIl((int)(var10 >>> 32), (int)var19, (int)(var14 >>> 32));
            if (!w.lIiiIiIlilli(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               return var9;
            }
         }
      }

      return null;
   }

   public void iiiIlIIIll(lilIIliilIIl w, class_2338 centre, class_2350 confirmTicks, IiIIiiIlliIIiiIl now, int face, int proof) {
      long var13 = 5248805933749510330L;
      long[][] var7 = new long[1][];
      boolean[][] var8 = new boolean[1][];
      this.iIlllIllll(w, centre, confirmTicks, var7, var8);
      this.IIiiIlIlIi.addLast(new liiiIIIiiiiiIIIi(centre, confirmTicks, now.IlIilIIlll, face + Math.max(1, proof), now.iiillIIlll, var7[0], var8[0]));
      this.lIiiIlIlIi.add(centre.method_10063());
      class_2338[] var9 = now.iiillIIlll;
      var13 ^= ((long)var9.length << 32 ^ var13) & -1L << 32;

      for (long var16 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
         class_2338 var12 = var9[(int)var16];
         this.iIiiIlIlIi.put(var12.method_10063(), face);
      }

      this.iIiiIlIlIi.entrySet().removeIf(nowx -> face - nowx.getValue() > 200);
      this.iIIiIlIlIi.lIlIliiIil++;
      this.iiIiIlIlIi = lIlilliliIlillil.lIiIlIIlil;
   }

   private static String Illillllil(class_2338 stand, class_2350 centre, class_2338 reason, llIilIIiilIilIIi face) {
      return stand.method_10063()
         + IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">()
         + (centre == null ? IlIIillIIi<"IlIIillIIi","p7LKvT6S08gSufKm2ZNir7ZJB+AlL7sOL4jKYYo=">() : centre.method_10151())
         + IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">()
         + (reason == null ? IlIIillIIi<"IlIIillIIi","p7LKvT6S08gSufKm2ZNir7ZJB+AlL7sOL4jKYYo=">() : Long.toString(reason.method_10063()))
         + (face == null ? "" : IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">() + face);
   }

   public lIIiililiIIiilil IIlllIlliIll(lilIIliilIIl now, int w) {
      return this.Illlllllilll(now, now, w);
   }

   private boolean llIIlilIIl(lilIIliilIIl bandHi, int w, int bandLo) {
      long var10 = 7804855630864052518L;
      long var12 = 7621248168721487109L;
      long var14 = -8834684261604470028L;
      var10 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var10) & -1L >>> 32;
      var12 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var12) & -1L << 32;

      for (long var19 = var12 ^ ((long)w ^ var12) & -1L >>> 32; (int)var19 <= bandLo; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         for (var14 ^= ((long)((int)var10) << 32 ^ var14) & -1L << 32; (int)(var14 >>> 32) <= (int)(var19 >>> 32); var14 += 4294967296L) {
            class_2338 var9 = this.lliIliliIl((int)(var10 >>> 32), (int)var19, (int)(var14 >>> 32));
            if (!this.liliIlIlIi.contains(var9.method_10063()) && bandHi.liiiIIllIl(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               return true;
            }
         }
      }

      return false;
   }

   private void iIlllIllll(lilIIliilIIl outKeys, class_2338 centre, class_2350 face, long[][] outSolid, boolean[][] w) {
      long var17 = 216650943448553270L;
      long var15 = 4520036746684776554L;
      class_2351 var6 = face.method_10166();
      class_2351[] var7 = IiIIIlIiliIIIlIi.lIiiIiIlilli(var6);
      long[] var8 = new long[34];
      boolean[] var9 = new boolean[var8.length];
      var15 ^= (0L ^ var15) & -1L << 32;

      for (var15 ^= (-2L ^ var15) & -1L >>> 32; (int)var15 <= 2; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         for (var17 ^= (-8589934592L ^ var17) & -1L << 32; (int)(var17 >>> 32) <= 2; var17 += 4294967296L) {
            if (Math.abs((int)var15) > 1 || Math.abs((int)(var17 >>> 32)) > 1) {
               class_2338 var13 = lllllillll(centre, var7[0], (int)var15, var7[1], (int)(var17 >>> 32), var6, 0);
               var8[(int)(var15 >>> 32)] = var13.method_10063();
               int var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var9[var10001] = outKeys.iIlIlllllill(var13.method_10263(), var13.method_10264(), var13.method_10260());
            }
         }
      }

      for (long var21 = var15 ^ ~var15 & -1L >>> 32; (int)var21 <= 1; var21 ^= (var21 ^ var21 + (long)2) & -1L >>> 32) {
         var17 ^= (-4294967296L ^ var17) & -1L << 32;

         while ((int)(var17 >>> 32) <= 1) {
            for (var17 ^= ~var17 & -1L >>> 32; (int)var17 <= 1; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               class_2338 var14 = lllllillll(centre, var7[0], (int)(var17 >>> 32), var7[1], (int)var17, var6, (int)var21);
               var8[(int)(var21 >>> 32)] = var14.method_10063();
               int var23 = (int)(var21 >>> 32);
               var21 += 4294967296L;
               var9[var23] = outKeys.iIlIlllllill(var14.method_10263(), var14.method_10264(), var14.method_10260());
            }

            var17 += 4294967296L;
         }
      }

      outSolid[0] = var8;
      w[0] = var9;
   }

   private int iIiIlIliIl() {
      return this.lIIiIlIlIi.lilIliilIl(this.IlIiIlIlIi);
   }

   public String lililiilil(lIIiililiIIiilil t) {
      return !this.liIiIlIlIi && this.IlIiIlIlIi < this.lIIiIlIlIi.Illlllllilll() && this.lIIiIlIlIi.Iiilliiliiil() != 0
         ? IlIIillIIi<"IlIIillIIi","XP5NyrYAa4Q31Y6VHxyzyPkho7UQiEpPL9078vtULjBJTVMISq9cM9Y/xOixKg==">()
            + this.llIiIlIlIi
            + IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">()
            + this.lIIiIlIlIi.Iilllilliill()
            + IlIIillIIi<"IlIIillIIi","iIPwVUoRRVhUbjN4z1YGQ5fm12sWUI+I6ZwwhvbZrV/svj8=">()
            + this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi)
            + IlIIillIIi<"IlIIillIIi","a84ZpLYjAefLE0Noys9rWkc73KfR9OkpNsOyyKRWeYh66Q==">()
            + this.IlIiIlIlIi
            + IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">()
            + this.lIIiIlIlIi.Illlllllilll()
            + IlIIillIIi<"IlIIillIIi","tg8ydBZTprO1hCMki3Xa3g3WPma/96hHA/JIVeTvbcVZoVgPyJplg+h+RA==">()
            + this.lIIiIlIlIi.IIlllIlliIll()
            + IlIIillIIi<"IlIIillIIi","HZFaSlEdrtiKpUAxiXAXzsWnX+qSsfOwt562jYS8bkiVbeE=">()
            + this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi)
            + IlIIillIIi<"IlIIillIIi","/DahqIbruk0qZ1g+SxfymupkVYVmJ71Fboo+iFc9U4Itt6BmnuyL">()
            + this.lIIiIlIlIi.lIiiIiIlilli()
            + IlIIillIIi<"IlIIillIIi","ZyFmppGioC64ECzuKQ+JqxtNGLhmDWTldBKsa6pqmm2qYIk=">()
            + this.iiIiIlIlIi
            + IlIIillIIi<"IlIIillIIi","5avkihBZA5tKz6ib6hmU+TBgzZmkWwuPhe5b3qgjFRKQ">()
            + this.IiIiIlIlIi
            + IlIIillIIi<"IlIIillIIi","WCbD3SgKnBxz0yKW6BCMBKwthER8dguLIycSS5A=">()
            + this.lIIiIlIlIi.IIillIiliIil()
            + (t == null ? "" : IlIIillIIi<"IlIIillIIi","EXw2tLpcPLnMXYhiDLrqJqYbD1Gy+gFrVyHHIc4=">() + t)
         : IlIIillIIi<"IlIIillIIi","s1AFbCki3h8ed5+MgpptwcSljLcKiY+BA9P0S5XnYG+nz0xZBK7ida/hAFra1nz6hHB+vg==">()
            + this.lIIiIlIlIi.Iilllilliill()
            + IlIIillIIi<"IlIIillIIi","FpjwfHfPAeJyaodzMlgODTL7OHGb9r5R3wOsyWGkhx32Jqu8">()
            + this.lIIiIlIlIi.Illlllllilll()
            + IlIIillIIi<"IlIIillIIi","ZyFmppGioC64ECzuKQ+JqxtNGLhmDWTldBKsa6pqmm2qYIk=">()
            + this.iiIiIlIlIi
            + IlIIillIIi<"IlIIillIIi","UxdZBJQ2qmCyHe9HUCcn8bgWMddQIkU/Ivl8FAeLZQHD2mK/S2VB">()
            + this.iIIiIlIlIi.iIiIliiIil
            + (t == null ? "" : IlIIillIIi<"IlIIillIIi","EXw2tLpcPLnMXYhiDLrqJqYbD1Gy+gFrVyHHIc4=">() + t);
   }

   public long IIIllIIliIIl() {
      return Math.max(0L, (long)this.lIIiIlIlIi.IIillIiliIil() - 1L - (long)this.IiIiIlIlIi);
   }

   public lliIIIliiliIIIli(Iiiiliiliiilii plan) {
      this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
      this.IlliIlIlIi = Integer.MIN_VALUE;
      this.illiIlIlIi = new HashMap<>();
      this.IiliIlIlIi = new HashSet<>();
      this.liliIlIlIi = new HashSet<>();
      this.iiliIlIlIi = new HashMap<>();
      this.IIiiIlIlIi = new ArrayDeque<>();
      this.lIiiIlIlIi = new HashSet<>();
      this.iIiiIlIlIi = new HashMap<>();
      this.IliiIlIlIi = Integer.MIN_VALUE;
      this.lIIiIlIlIi = plan;
      this.liIiIlIlIi = plan.IIlilIliiIli() == 0L;
      if (this.liIiIlIlIi) {
         this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
      }
   }

   private int illIlIilIl() {
      return Math.max(
         this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IIIllIIliIIl()), this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) - 1
      );
   }

   static String illilIilil(class_2338 p) {
      return p == null
         ? IlIIillIIi<"IlIIillIIi","plbZ7BWsEGwQExnC8AF1sWtHm64nF/LVBPIRtJs=">()
         : p.method_10263()
            + IlIIillIIi<"IlIIillIIi","VYGzIU22Vjo0Q4fSLO4cWt8+lmgL95BSBp77hDE=">()
            + p.method_10264()
            + IlIIillIIi<"IlIIillIIi","VYGzIU22Vjo0Q4fSLO4cWt8+lmgL95BSBp77hDE=">()
            + p.method_10260();
   }

   private static class_2350 IIIilIIiiIIi(lilIIliilIIl preferred, class_2338 p, class_2350 w) {
      long var7 = 5787118120835990921L;
      if (w.method_10166() != class_2351.field_11052 && lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), w)) {
         return w;
      } else {
         class_2350[] var3 = class_2350.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            class_2350 var6 = var3[(int)var7];
            if (var6.method_10166() != class_2351.field_11052
               && lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), var6)) {
               return var6;
            }
         }

         var3 = class_2350.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for (long var14 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            class_2350 var10 = var3[(int)var14];
            if (lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), var10)) {
               return var10;
            }
         }

         return w;
      }
   }

   public void ilIllIiIll() {
      this.IIiiIlIlIi.clear();
      this.lIiiIlIlIi.clear();
   }

   public boolean IllIllllIl(lilIIliilIIl select) {
      if (this.liIiIlIlIi && this.IIIiIlIlIi < 2) {
         this.liliIlIlIi.clear();
         if (!this.IIiilIiiiIii(select)) {
            return false;
         } else {
            this.liIiIlIlIi = false;
            this.Iilililiiili();
            return true;
         }
      } else {
         return false;
      }
   }

   public void iiIilIIlil(class_2338 centre, class_2350 face) {
      long var6 = 7833046955598575929L;
      if (centre != null && face != null) {
         var6 ^= (-8589934592L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) <= 2) {
            for (var6 ^= (-2L ^ var6) & -1L >>> 32; (int)var6 <= 2; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
               class_2351[] var5 = IiIIIlIiliIIIlIi.lIiiIiIlilli(face.method_10166());
               this.IiIilliIil(lllllillll(centre, var5[0], (int)(var6 >>> 32), var5[1], (int)var6, face.method_10166(), 0));
            }

            var6 += 4294967296L;
         }
      }
   }

   public String lIIlliIIll(lilIIliilIIl w, int now) {
      long var16 = -552872075427456567L;
      long var12 = 5600950541474811243L;
      long var14 = -871113155484289001L;
      StringBuilder var3 = null;

      while (!this.IIiiIlIlIi.isEmpty() && this.IIiiIlIlIi.peekFirst().IlIiIlliil <= now) {
         liiiIIIiiiiiIIIi var4 = this.IIiiIlIlIi.pollFirst();
         this.lIiiIlIlIi.remove(var4.IIIiIlliil.method_10063());
         var12 ^= (0L ^ var12) & -1L << 32;
         class_2338[] var6 = var4.llIiIlliil;
         var12 ^= ((long)var6.length ^ var12) & -1L >>> 32;

         for (var14 ^= (0L ^ var14) & -1L << 32; (int)(var14 >>> 32) < (int)var12; var14 += 4294967296L) {
            class_2338 var9 = var6[(int)(var14 >>> 32)];
            if (w.liiiIIllIl(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               var12 += 4294967296L;
            }
         }

         var14 ^= ((long)Math.max(0, var4.iIIiIlliil - (int)(var12 >>> 32)) ^ var14) & -1L >>> 32;
         this.iIIiIlIlIi.iIlIliiIil += (int)var14;
         this.iIIiIlIlIi.IliIliiIil += (int)(var12 >>> 32);
         var12 ^= (0L ^ var12) & -1L >>> 32;
         var14 ^= (0L ^ var14) & -1L << 32;

         for (var16 ^= (0L ^ var16) & -1L << 32; (int)(var16 >>> 32) < var4.ilIiIlliil.length; var16 += 4294967296L) {
            if (var4.IiIiIlliil[(int)(var16 >>> 32)]) {
               class_2338 var10 = class_2338.method_10092(var4.ilIiIlliil[(int)(var16 >>> 32)]);
               if (!w.iIlIlllllill(var10.method_10263(), var10.method_10264(), var10.method_10260())) {
                  Integer var11 = this.iIiiIlIlIi.get(var4.ilIiIlliil[(int)(var16 >>> 32)]);
                  if (var11 == null) {
                     if (w.IliIlllilIi(var10.method_10263(), var10.method_10264(), var10.method_10260())) {
                        var14 += 4294967296L;
                     } else if (!IlIllllIll(var4, var10)) {
                        var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
                     }
                  }
               }
            }
         }

         this.iIIiIlIlIi.IiiIliiIil += (int)(var14 >>> 32);
         this.iIIiIlIlIi.iliIliiIil += (int)var12;
         if ((int)(var12 >>> 32) > 0 || (int)(var14 >>> 32) > 0 || (int)var12 > 0) {
            if (var3 == null) {
               var3 = new StringBuilder();
            }

            var3.append(var3.length() == 0 ? "" : IlIIillIIi<"IlIIillIIi","cQKCW651Yj1LC7zgmTx1hr+pdpPoMZUwoMXzaUCpYw==">())
               .append(IlIIillIIi<"IlIIillIIi","wlxe3oaeAlfvp0Six4sbyKmRV2924rU/AKJMwN+E9MEFphw=">())
               .append(illilIilil(var4.IIIiIlliil))
               .append(IlIIillIIi<"IlIIillIIi","jXGygbw+4Tk4SuUpeMAosQleA+uFDpxzQwZIxH1XahLzLg==">())
               .append(var4.lIIiIlliil)
               .append(IlIIillIIi<"IlIIillIIi","5/INKQ3dKkttp3JyCuTTG1gLrnsR9/uKVCNOmeTqhwl4MwB3Zxc=">())
               .append(var4.iIIiIlliil)
               .append(IlIIillIIi<"IlIIillIIi","2Z05/v3/SvZeDFVZBU2nNOQxiwxFf4uj7MhTffqtEvAF1zE8gw==">())
               .append((int)var14)
               .append(IlIIillIIi<"IlIIillIIi","0SolVL7/puQxTsTT9GxJqOcuNfsXGs7Po2tUpaJoUT4sAmVwHAzUj3Jd">())
               .append((int)(var12 >>> 32))
               .append(IlIIillIIi<"IlIIillIIi","gN3EhQbTRvDje9GWttKcp4DKA9ueBXE6QMB653I4W9nRNFncpkDY4TTVRyDo">())
               .append((int)(var14 >>> 32))
               .append(IlIIillIIi<"IlIIillIIi","5rt/RF0GLVWg/YStIUGE0sEZd06gOvzk5V43kGap4sY1N02YtVCPmJc=">())
               .append((int)var12);
         }

         if ((int)(var12 >>> 32) > 0) {
            this.IIllllIlll(var4.IIIiIlliil);
         }
      }

      if (this.iiIiIlIlIi == lIlilliliIlillil.lIiIlIIlil && this.IIiiIlIlIi.isEmpty()) {
         this.iiIiIlIlIi = lIlilliliIlillil.lliIlIIlil;
      }

      return var3 == null ? null : var3.toString();
   }

   public iillllilIIilllil liiiIIllIl() {
      return this.iIIiIlIlIi;
   }

   private long lIilliIill() {
      return this.liIiIlIlIi ? Long.MAX_VALUE : this.ilillIiill() + (long)this.lIIiIlIlIi.Ililllililil() * (long)this.lIIiIlIlIi.IIillIiliIil();
   }

   private lIIiililiIIiilil Iilllilliill(lilIIliilIIl now, int w) {
      long var14 = 8258606072517130321L;
      if (this.liIiIlIlIi) {
         this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
         return null;
      } else {
         this.IiiiIlIlIi = null;

         for (long var19 = var14 ^ (0L ^ var14) & -1L << 32; (int)(var19 >>> 32) < 8192; var19 += 4294967296L) {
            class_2338 var4 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
            long var5 = var4.method_10063();
            if (!this.iIIIlIlIIl(now).lIiiIiIlilli(var4.method_10263(), var4.method_10264(), var4.method_10260())) {
               this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
               return new lIIiililiIIiilil(
                  this.IlIiIlIlIi,
                  this.llIiIlIlIi,
                  this.ilIiIlIlIi,
                  this.IiIiIlIlIi,
                  var4,
                  var4,
                  this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi),
                  this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi),
                  this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi),
                  true,
                  this.iIliIlIlIi
               );
            }

            if (!this.liliIlIlIi.contains(var5)
               && !this.IiliIlIlIi.contains(var5)
               && lilillliililll.IIiilIiiiIii(
                  now, this.lIIiIlIlIi.IilliliilIIi(), var4.method_10263(), var4.method_10264(), var4.method_10260(), this.lIIiIlIlIi.IiIlliIliiIl()
               )) {
               class_2350 var7 = this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi);
               class_2338 var8 = this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
               long var9 = this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
               iiIIlIllIIlIlIll var11 = lilillliililll.IlIillIiilIi(
                  now,
                  this.lIIiIlIlIi.IilliliilIIi(),
                  var4.method_10263(),
                  var4.method_10264(),
                  var4.method_10260(),
                  this.lIIiIlIlIi.IiIlliIliiIl(),
                  this.Ilillllill()
               );
               if (var11 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.IIiIlIIlil;
                  class_2350 var16 = var11.ililIillll ? var11.IillIillll : var7;
                  class_2338 var18 = var11.ililIillll ? this.lIIiIlIlIi.iIiIlIliIl(var11.liiiIIllIl(), var11.IillIillll, this.IlIiIlIlIi) : var8;
                  return new lIIiililiIIiilil(
                     this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var11.liiiIIllIl(), var18, var16, var9, false, this.iIliIlIlIi
                  );
               }

               class_2338 var12 = this.Iiilliiliiil(now, var4);
               if (var12 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.IIiIlIIlil;
                  class_2350 var17 = IIIilIIiiIIi(now, var12, var7);
                  return new lIIiililiIIiilil(
                     this.IlIiIlIlIi,
                     this.llIiIlIlIi,
                     this.ilIiIlIlIi,
                     this.IiIiIlIlIi,
                     var4,
                     var12,
                     this.lIIiIlIlIi.lliIliliIl(var12, var17, this.IlIiIlIlIi, true),
                     var17,
                     var9,
                     false,
                     this.iIliIlIlIi,
                     true
                  );
               }

               class_2338 var13 = this.IlIillIiilIi(now, var4);
               if (var13 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
                  return new lIIiililiIIiilil(
                     this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var13, var8, var7, var9, true, this.iIliIlIlIi
                  );
               }
            }

            if (!this.IiIiliIiiiIi(now)) {
               return this.IiiiIlIlIi;
            }
         }

         return null;
      }
   }

   private class_2350 Ilillllill() {
      return class_2350.method_10169(
         this.lIIiIlIlIi.iliIiiliiiii(), this.lIIiIlIlIi.IIiilIiiiIii(this.IlIiIlIlIi) > 0 ? class_2352.field_11056 : class_2352.field_11060
      );
   }

   public boolean IlIlllIlilIl() {
      return !this.IIiiIlIlIi.isEmpty();
   }

   private boolean Ililllililil(lilIIliilIIl bandLo, int bandHi, int w) {
      class_2338 var4 = this.IIillIiliIil(this.iIIIlIlIIl(bandLo), bandHi, w);
      if (var4 == null) {
         return false;
      } else {
         this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
         this.IiiiIlIlIi = new lIIiililiIIiilil(
            this.IlIiIlIlIi,
            this.llIiIlIlIi,
            this.ilIiIlIlIi,
            this.IiIiIlIlIi,
            var4,
            var4,
            this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi),
            this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi),
            this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi),
            true,
            this.iIliIlIlIi
         );
         return true;
      }
   }

   private void IiIIlliIIl(lilIIliilIIl bandLo, int w, int bandHi) {
      long var11 = 899968240303340451L;
      long var13 = 711867446240035416L;
      long var15 = -8641886221320581645L;
      var11 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var11) & -1L >>> 32;
      var13 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var13) & -1L << 32;
      class_2350 var7 = class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056);

      for (long var20 = var13 ^ ((long)w ^ var13) & -1L >>> 32; (int)var20 <= bandHi; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         for (var15 ^= ((long)((int)var11) << 32 ^ var15) & -1L << 32; (int)(var15 >>> 32) <= (int)(var20 >>> 32); var15 += 4294967296L) {
            class_2338 var10 = this.lliIliliIl((int)(var11 >>> 32), (int)var20, (int)(var15 >>> 32));
            if (bandLo.liiiIIllIl(var10.method_10263(), var10.method_10264(), var10.method_10260()) && this.iiIIlIIlIl(var10, var7)) {
               this.liliIlIlIi.add(var10.method_10063());
            }
         }
      }

      this.iIIiIlIlIi.iIiIliiIil = this.liliIlIlIi.size();
   }

   public class_2351 lIiiIiIlilli() {
      return this.lIIiIlIlIi.IiIlliIliiIl();
   }

   public void lIliliIlil(int horizontal, int vertical) {
      this.iIIiIlIlIi.illIliiIil = this.iIIiIlIlIi.illIliiIil + Math.abs(horizontal);
      this.iIIiIlIlIi.IilIliiIil = this.iIIiIlIlIi.IilIliiIil + Math.abs(vertical);
   }

   public void llIililIil() {
      this.iIIiIlIlIi.IIiIliiIil++;
   }

   public Iiiiliiliiilii IliIlllilIi() {
      return this.lIIiIlIlIi;
   }

   public boolean lIlIliIlIl(lilIIliilIIl w) {
      long var6 = -1817546374232829709L;
      long var8 = -1377888469644931608L;
      IIIiliilIIilii var2 = this.lIIiIlIlIi.IilliliilIIi();
      var6 ^= ((long)var2.lliiIliIIl << 32 ^ var6) & -1L << 32;

      while ((int)(var6 >>> 32) <= var2.liiiIliIIl) {
         for (var6 ^= ((long)var2.iliiIliIIl ^ var6) & -1L >>> 32; (int)var6 <= var2.iiiiIliIIl; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            for (var8 ^= ((long)var2.IiiiIliIIl << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) <= var2.IIIIlliIIl; var8 += 4294967296L) {
               if (w.lIiiIiIlilli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)) && w.liiiIIllIl((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
                  return true;
               }
            }
         }

         var6 += 4294967296L;
      }

      return false;
   }

   public boolean IIIIllIIIl(lilIIliilIIl w) {
      return this.llIIlilIIl(this.iIIIlIlIIl(w), this.IIiIllIiIl(), this.iIiIlIliIl());
   }

   private class_2338 Iiilliiliiil(lilIIliilIIl centre, class_2338 w) {
      class_2338[] var3 = new class_2338[]{null};
      IiIIIlIiliIIIlIi.liiiIIllIl(
         w,
         class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056),
         (y, z, x) -> {
            if (var3[0] == null && lilillliililll.Iliilliiilii(centre, y, z, x)) {
               if (!lilillliililll.iliIiiliiiii(
                  centre, this.lIIiIlIlIi.IilliliilIIi(), this.lIIiIlIlIi.IiIlliIliiIl(), y, z, x, w.method_10263(), w.method_10264(), w.method_10260()
               )) {
                  if (!lilillliililll.Iilililiiili(
                     centre,
                     this.lIIiIlIlIi.IilliliilIIi(),
                     y,
                     z,
                     x,
                     this.lIIiIlIlIi.IiIlliIliiIl(),
                     this.lIIiIlIlIi::IiiIlliiIl,
                     this.ilillIiill(),
                     this.lIilliIill()
                  )) {
                     var3[0] = new class_2338(y, z, x);
                  }
               }
            }
         }
      );
      return var3[0];
   }

   public long iliIiiliiiii(int y, int z, int x) {
      return this.lIIiIlIlIi.IiiIlliiIl(y, z, x);
   }

   public void IiIilliIil(class_2338 centre) {
      if (centre != null) {
         long var2 = centre.method_10063();
         this.illiIlIlIi.remove(var2);
         this.IiliIlIlIi.remove(var2);
         this.iiliIlIlIi.remove(var2);
      }
   }

   private void IIllllIlll(class_2338 centre) {
      long var2 = centre.method_10063();
      if (this.illiIlIlIi.merge(var2, 1, Integer::sum) >= this.liIlliiIll()) {
         this.IiliIlIlIi.add(var2);
         this.illiIlIlIi.remove(var2);
      }
   }

   public boolean Iiiiliiiiiii(lilIIliilIIl w) {
      return this.llIIlilIIl(this.iIIIlIlIIl(w), this.illIlIilIl(), this.lilIliilIl());
   }

   private boolean iiIIlIIlIl(class_2338 face, class_2350 p) {
      if (this.IiliIlIlIi.isEmpty()) {
         return false;
      } else {
         boolean[] var3 = new boolean[]{false};
         IiIIIlIiliIIIlIi.liiiIIllIl(face, p, (hit, z, x) -> {
            if (!var3[0] && this.IiliIlIlIi.contains(class_2338.method_10064(hit, z, x))) {
               var3[0] = true;
            }
         });
         return var3[0];
      }
   }

   private long ilillIiill() {
      return this.liIiIlIlIi
         ? Long.MAX_VALUE
         : this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi) + this.IIIllIIliIIl();
   }

   private int IIiIllIiIl() {
      return this.lIIiIlIlIi.illIlIilIl(this.IlIiIlIlIi);
   }

   private boolean Illillliilli(lilIIliilIIl w) {
      this.iiIiIlIlIi = lIlilliliIlillil.liiIlIIlil;
      if (++this.llIiIlIlIi < this.lIIiIlIlIi.Iilllilliill()) {
         this.iIIiIlIlIi.lilIliiIil++;
         return true;
      } else {
         this.llIiIlIlIi = 0;
         this.iIIiIlIlIi.IIlIliiIil++;
         if (++this.IlIiIlIlIi < this.lIIiIlIlIi.Illlllllilll()) {
            this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
            this.IlliIlIlIi = Integer.MIN_VALUE;
            return true;
         } else if (this.IIIiIlIlIi < 2 && !this.IIiiIlIlIi.isEmpty()) {
            this.IlIiIlIlIi = this.lIIiIlIlIi.Illlllllilll() - 1;
            this.llIiIlIlIi = this.lIIiIlIlIi.Iilllilliill() - 1;
            this.ilIiIlIlIi = this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi) - 1;
            this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else {
            if (this.IIIiIlIlIi < 2) {
               this.liliIlIlIi.clear();
               if (this.IIiilIiiiIii(w)) {
                  this.Iilililiiili();
                  return true;
               }
            }

            this.liIiIlIlIi = true;
            this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
            return false;
         }
      }
   }

   private int liIlliiIll() {
      return this.IIIiIlIlIi > 0 ? 1 : 3;
   }

   private class_2338 lliIliliIl(int depth, int sweepCoord, int bandCoord) {
      long var7 = -368780049237099203L;
      long var9 = 8637087198070934077L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;
      switch (this.lIIiIlIlIi.iliIiiliiiii()) {
         case field_11048:
            var7 ^= ((long)depth << 32 ^ var7) & -1L << 32;
            break;
         case field_11052:
            var7 ^= ((long)depth ^ var7) & -1L >>> 32;
            break;
         case field_11051:
            var9 ^= ((long)depth << 32 ^ var9) & -1L << 32;
      }

      switch (this.lIIiIlIlIi.IIIllIIliIIl()) {
         case field_11048:
            var7 ^= ((long)sweepCoord << 32 ^ var7) & -1L << 32;
            break;
         case field_11052:
            var7 ^= ((long)sweepCoord ^ var7) & -1L >>> 32;
            break;
         case field_11051:
            var9 ^= ((long)sweepCoord << 32 ^ var9) & -1L << 32;
      }

      switch (this.lIIiIlIlIi.IlIlllIlilIl()) {
         case field_11048:
            var7 ^= ((long)bandCoord << 32 ^ var7) & -1L << 32;
            break;
         case field_11052:
            var7 ^= ((long)bandCoord ^ var7) & -1L >>> 32;
            break;
         case field_11051:
            var9 ^= ((long)bandCoord << 32 ^ var9) & -1L << 32;
      }

      return new class_2338((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32));
   }

   private boolean IIiilIiiiIii(lilIIliilIIl w) {
      long var6 = 2211354385950975953L;
      long var8 = 3692589327325267250L;
      IIIiliilIIilii var2 = this.lIIiIlIlIi.IilliliilIIi();
      var6 ^= ((long)var2.lliiIliIIl << 32 ^ var6) & -1L << 32;

      while ((int)(var6 >>> 32) <= var2.liiiIliIIl) {
         for (var6 ^= ((long)var2.iliiIliIIl ^ var6) & -1L >>> 32; (int)var6 <= var2.iiiiIliIIl; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            for (var8 ^= ((long)var2.IiiiIliIIl << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) <= var2.IIIIlliIIl; var8 += 4294967296L) {
               if (w.lIiiIiIlilli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))
                  && !this.liliIlIlIi.contains(class_2338.method_10064((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)))
                  && w.liiiIIllIl((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
                  return true;
               }
            }
         }

         var6 += 4294967296L;
      }

      return false;
   }

   public lIlilliliIlillil iIlIlllllill() {
      return this.iiIiIlIlIi;
   }

   private int lilIliilIl() {
      return Math.min(
         this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IIIllIIliIIl()), this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) + 1
      );
   }

   private void Iliilliiilii() {
      long var3 = -5869472520585824546L;
      var3 ^= ((long)this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) << 32 ^ var3) & -1L << 32;
      if (this.IlliIlIlIi != Integer.MIN_VALUE) {
         var3 ^= ((long)Integer.compare((int)(var3 >>> 32), this.IlliIlIlIi) ^ var3) & -1L >>> 32;
         if ((int)var3 != 0) {
            this.iIIiIlIlIi.IilIliiIil = this.iIIiIlIlIi.IilIliiIil + Math.abs((int)(var3 >>> 32) - this.IlliIlIlIi);
            if (this.llliIlIlIi != 0 && (int)var3 != this.llliIlIlIi) {
               this.iIIiIlIlIi.iilIliiIil++;
            }

            this.llliIlIlIi = (int)var3;
         }
      }

      this.IlliIlIlIi = (int)(var3 >>> 32);
   }

   private static boolean IlIllllIll(liiiIIIiiiiiIIIi g, class_2338 p) {
      long var7 = -2261460112924881273L;
      class_2338 var2 = p.method_10074();
      class_2338[] var3 = g.llIiIlliil;
      var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_2338 var6 = var3[(int)var10];
         if (var6.equals(var2)) {
            return true;
         }
      }

      return false;
   }

   public void Iillllilll(class_2338 reason, class_2350 face, class_2338 stand, llIilIIiilIilIIi centre) {
      long var9 = -7279080753365094287L;
      if (reason != null) {
         this.iIIiIlIlIi.IllIliiIil++;
         long var5 = reason.method_10063();
         Set var7 = this.iiliIlIlIi.computeIfAbsent(var5, k -> new HashSet<>());
         if (!var7.add(Illillllil(reason, face, stand, centre))) {
            this.iIIiIlIlIi.lIiIliiIil++;
         }

         var7.add(Illillllil(reason, face, stand, null));
         var9 ^= ((long)this.illiIlIlIi.merge(var5, 1, Integer::sum).intValue() << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) >= this.liIlliiIll()) {
            this.IiliIlIlIi.add(var5);
            this.illiIlIlIi.remove(var5);
         }
      }
   }

   public boolean liilliiill(lilIIliilIIl w) {
      if (this.liIiIlIlIi) {
         return false;
      } else {
         class_2338 var2 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
         boolean[] var3 = new boolean[]{false};
         IiIIIlIiliIIIlIi.liiiIIllIl(var2, class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056), (x, y, open) -> {
            if (!var3[0] && w.liiiIIllIl(x, y, open) && iIIilIlIil(w, new class_2338(x, y, open), this.lIIiIlIlIi.IiIlliIliiIl())) {
               var3[0] = true;
            }
         });
         return !var3[0];
      }
   }

   private static boolean iIIilIlIil(lilIIliilIIl c, class_2338 w, class_2351 normal) {
      long var8 = 4709935010966245431L;
      class_2352[] var3 = class_2352.values();
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         class_2352 var6 = var3[(int)var11];
         class_2350 var7 = class_2350.method_10169(normal, var6);
         if (!c.iIlIlllllill(w.method_10263() + var7.method_10148(), w.method_10264() + var7.method_10164(), w.method_10260() + var7.method_10165())) {
            return true;
         }
      }

      return false;
   }

   public boolean IIIillIIil(class_2338 p) {
      if (this.liIiIlIlIi) {
         return false;
      } else {
         class_2338 var2 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
         return IiIIIlIiliIIIlIi.IilliliilIIi(
            var2.method_10263(), var2.method_10264(), var2.method_10260(), this.lIIiIlIlIi.IiIlliIliiIl(), p.method_10263(), p.method_10264(), p.method_10260()
         );
      }
   }

   private boolean IIlilIliiIli(lilIIliilIIl w) {
      this.Iliilliiilii();
      if (++this.ilIiIlIlIi < this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi)) {
         this.iiIiIlIlIi = lIlilliliIlillil.IilIlIIlil;
         return true;
      } else {
         this.ilIiIlIlIi = this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi) - 1;
         this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
         if (!this.IIiiIlIlIi.isEmpty()) {
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else if (this.Ililllililil(w, this.IIiIllIiIl(), this.iIiIlIliIl())) {
            return false;
         } else {
            this.ilIiIlIlIi = 0;
            this.IiIiIlIlIi = 0;
            this.iiIiIlIlIi = lIlilliliIlillil.IiiIlIIlil;
            if (this.IIIIllIIIl(w)) {
               if (this.lIliIlIlIi++ < 2) {
                  this.IiliIlIlIi.clear();
                  this.iIliIlIlIi = true;
                  this.iIIiIlIlIi.lllIliiIil++;
                  this.iiIiIlIlIi = lIlilliliIlillil.IilIlIIlil;
                  return true;
               }

               this.IiIIlliIIl(this.iIIIlIlIIl(w), this.IIiIllIiIl(), this.iIiIlIliIl());
            }

            this.iIIiIlIlIi.liIIliiIil++;
            this.lIliIlIlIi = 0;
            this.iIliIlIlIi = false;
            return this.Illillliilli(w);
         }
      }
   }

   public boolean IiiIlliiIl(class_2338 stand, class_2350 face, class_2338 centre) {
      Set var4 = this.iiliIlIlIi.get(stand.method_10063());
      return var4 != null && var4.contains(Illillllil(stand, face, centre, null));
   }

   public lIIiililiIIiilil Illlllllilll(lilIIliilIIl select, lilIIliilIIl now, int verify) {
      if (this.IliiIlIlIi == verify) {
         return this.lliiIlIlIi;
      } else {
         this.IliiIlIlIi = verify;
         this.iliiIlIlIi = now;
         this.lliiIlIlIi = this.Iilllilliill(select, verify);
         return this.lliiIlIlIi;
      }
   }

   public boolean IilliliilIIi() {
      return this.liIiIlIlIi;
   }

   private void Iilililiiili() {
      this.IIIiIlIlIi++;
      this.iIIiIlIlIi.lliIliiIil++;
      this.IlIiIlIlIi = 0;
      this.llIiIlIlIi = 0;
      this.ilIiIlIlIi = 0;
      this.IiIiIlIlIi = 0;
      this.IiliIlIlIi.clear();
      this.illiIlIlIi.clear();
      this.iiliIlIlIi.clear();
      this.IIliIlIlIi = 0;
      this.lIliIlIlIi = 0;
      this.iIliIlIlIi = true;
      this.IlliIlIlIi = Integer.MIN_VALUE;
      this.IliiIlIlIi = Integer.MIN_VALUE;
      this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
   }

   public boolean IiIlliIliiIl(class_2338 centre) {
      return centre != null && this.lIiiIlIlIi.contains(centre.method_10063());
   }

   public boolean iilllIIill(lilIIliilIIl x, int y, int w, int z) {
      return lilillliililll.Iilililiiili(
         x, this.lIIiIlIlIi.IilliliilIIi(), y, w, z, this.lIIiIlIlIi.IiIlliIliiIl(), this.lIIiIlIlIi::IiiIlliiIl, this.ilillIiill(), this.lIilliIill()
      );
   }

   private static class_2338 lllllillll(class_2338 c, class_2351 d2, int a2, class_2351 d1, int a1, class_2351 a3, int d3) {
      long var10 = -2531058565612274996L;
      long var12 = -7754220252408482867L;
      var10 ^= ((long)c.method_10263() << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)c.method_10264() ^ var10) & -1L >>> 32;
      var12 ^= ((long)c.method_10260() << 32 ^ var12) & -1L << 32;
      switch (d2) {
         case field_11048:
            var10 ^= ((long)((int)(var10 >>> 32) + a2) << 32 ^ var10) & -1L << 32;
            break;
         case field_11052:
            var10 ^= ((long)((int)var10 + a2) ^ var10) & -1L >>> 32;
            break;
         case field_11051:
            var12 ^= ((long)((int)(var12 >>> 32) + a2) << 32 ^ var12) & -1L << 32;
      }

      switch (d1) {
         case field_11048:
            var10 ^= ((long)((int)(var10 >>> 32) + a1) << 32 ^ var10) & -1L << 32;
            break;
         case field_11052:
            var10 ^= ((long)((int)var10 + a1) ^ var10) & -1L >>> 32;
            break;
         case field_11051:
            var12 ^= ((long)((int)(var12 >>> 32) + a1) << 32 ^ var12) & -1L << 32;
      }

      switch (a3) {
         case field_11048:
            var10 ^= ((long)((int)(var10 >>> 32) + d3) << 32 ^ var10) & -1L << 32;
            break;
         case field_11052:
            var10 ^= ((long)((int)var10 + d3) ^ var10) & -1L >>> 32;
            break;
         case field_11051:
            var12 ^= ((long)((int)(var12 >>> 32) + d3) << 32 ^ var12) & -1L << 32;
      }

      return new class_2338((int)(var10 >>> 32), (int)var10, (int)(var12 >>> 32));
   }

   private boolean IiIiliIiiiIi(lilIIliilIIl w) {
      if (++this.IiIiIlIlIi < this.lIIiIlIlIi.IIillIiliIil()) {
         this.iiIiIlIlIi = lIlilliliIlillil.lilIlIIlil;
         return true;
      } else {
         this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
         if (!this.IIiiIlIlIi.isEmpty()) {
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else if (this.Ililllililil(w, this.illIlIilIl(), this.lilIliilIl())) {
            return false;
         } else {
            this.IiIiIlIlIi = 0;
            this.iiIiIlIlIi = lIlilliliIlillil.lliIlIIlil;
            if (this.Iiiiliiiiiii(w)) {
               if (this.IIliIlIlIi++ < 2) {
                  this.IiliIlIlIi.clear();
                  this.iIliIlIlIi = true;
                  this.iIIiIlIlIi.lllIliiIil++;
                  this.iiIiIlIlIi = lIlilliliIlillil.lilIlIIlil;
                  return true;
               }

               this.IiIIlliIIl(this.iIIIlIlIIl(w), this.illIlIilIl(), this.lilIliilIl());
            }

            this.iIIiIlIlIi.iiIIliiIil++;
            this.IIliIlIlIi = 0;
            this.iIliIlIlIi = false;
            this.IiliIlIlIi.clear();
            return this.IIlilIliiIli(w);
         }
      }
   }

   private lilIIliilIIl iIIIlIlIIl(lilIIliilIIl fallback) {
      return this.iliiIlIlIi != null ? this.iliiIlIlIi : fallback;
   }

   private class_2338 IlIillIiilIi(lilIIliilIIl w, class_2338 centre) {
      if (w.liiiIIllIl(centre.method_10263(), centre.method_10264(), centre.method_10260())) {
         return w.IilliliilIIi(centre.method_10263(), centre.method_10264(), centre.method_10260()) ? null : centre;
      } else {
         class_2338[] var3 = new class_2338[]{null};
         IiIIIlIiliIIIlIi.liiiIIllIl(centre, class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056), (out, wx, z) -> {
            if (var3[0] == null && w.liiiIIllIl(out, wx, z) && !w.IilliliilIIi(out, wx, z)) {
               var3[0] = new class_2338(out, wx, z);
            }
         });
         return var3[0];
      }
   }
}
