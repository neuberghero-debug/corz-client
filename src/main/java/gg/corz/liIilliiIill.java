package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntPredicate;

public final class liIilliiIill {
   private int ilIlilIiIiIlilIi;
   private lIIiiiIiiIIiiiIi llllilIiilllilIi;
   private int lIililIiiIililIi;
   private static final String[] iIiIilIiIliIilIi = new String[]{
      lilIliilIl<"lilIliilIl","+GUrhDZsKMjYURmhY6rxRsmKjb5CweGZfW/zNptXwh8=">(),
      lilIliilIl<"lilIliilIl","ISIrvpqvl9UygopR9ptsHppKY6wW7UnfdqujerNn">(),
      lilIliilIl<"lilIliilIl","lSK9fjnRys5Q4dToQsct3+zUpNHl4SnUwZ4aGCaFX62z">(),
      lilIliilIl<"lilIliilIl","hNiBl+pTGQCn5yD1CfnPMEDPCutRAe7doOBf4SH4H2sQ">(),
      lilIliilIl<"lilIliilIl","OEMUschpOUeOl1HUz6CMIsQK1c6We9duKn5rhsruy/c=">(),
      lilIliilIl<"lilIliilIl","A2qMIjaUlInhoFKaXQEvoBA1t8JRJ1nRKmcwRXm4Ya4=">()
   };
   private int lIIlilIiiIIlilIi;
   private int iIllilIiIlllilIi;
   private final Set<Integer> IiiIilIiliiIilIi;
   private int IlililIillililIi;
   private int IillilIilillilIi;
   private static final int[] lilIilIiiilIilIi = new int[]{-1, 1, 0, 0, 0, 0};
   private int liIlilIiiiIlilIi;
   private static final int[] IllIilIilllIilIi = new int[]{1, 0, 3, 2, 5, 4};
   private int iillilIiIIililIi;
   private static final int[] illIilIiIilIilIi = new int[]{0, 0, 0, 0, -1, 1};
   private int IIllilIilIllilIi;
   private static final int[] IIiIilIilIiIilIi = new int[]{0, 0, -1, 1, 0, 0};
   private int IlIlilIillIlilIi;
   private final Set<Integer> iiiIilIiIIIlilIi = new TreeSet<>();
   private final long lliIilIiiliIilIi;
   public static final int ilililIiIiililIi = 2;

   public void Illillliilli(int tick, int face) {
      this.liIlilIiiiIlilIi = tick;
      this.IIllilIilIllilIi = face;
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.ilIilIIlIi;
      this.Iilllilliill(tick, face);
   }

   public void IilliliilIIi(Set<Integer> presentFaces) {
      this.iiiIilIiIIIlilIi.clear();
      if (presentFaces != null) {
         for (Integer var3 : presentFaces) {
            if (var3 != null && var3 >= 0 && var3 < 6) {
               this.iiiIilIiIIIlilIi.add(var3);
            }
         }
      }
   }

   public int IIIIllIIIl() {
      return this.IillilIilillilIi;
   }

   public liIilliiIill(long wantedFaces, Set<Integer> target) {
      this.IlIlilIillIlilIi = -1;
      this.ilIlilIiIiIlilIi = -1;
      this.liIlilIiiiIlilIi = -1;
      this.IIllilIilIllilIi = -1;
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.llIilIIlIi;
      this.IlililIillililIi = -1;
      this.lliIilIiiliIilIi = wantedFaces;
      TreeSet var4 = new TreeSet();
      if (target != null) {
         for (Integer var6 : target) {
            if (var6 != null && var6 >= 0 && var6 < 6) {
               var4.add(var6);
            }
         }
      }

      this.IiiIilIiliiIilIi = Collections.unmodifiableSet(var4);
   }

   public int Iiiiliiiiiii() {
      return this.IlililIillililIi;
   }

   public int Illlllllilll() {
      return this.lIIlilIiiIIlilIi;
   }

   public void lIlIliIlIl(Set<Integer> predicted, Set<Integer> authoritative, int tick) {
      this.IilliliilIIi(predicted);
      if (this.liIlilIiiiIlilIi >= 0 && authoritative != null && authoritative.contains(this.liIlilIiiiIlilIi)) {
         this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.IiIilIIlIi;
         this.IillilIilillilIi++;
         this.IlililIillililIi = this.IIllilIilIllilIi < 0 ? -1 : tick - this.IIllilIilIllilIi;
         this.liIlilIiiiIlilIi = -1;
         this.IIllilIilIllilIi = -1;
         this.iIllilIiIlllilIi = 0;
      }
   }

   public void Iilllilliill(int tick, int face) {
      this.lIIlilIiiIIlilIi++;
      this.ilIlilIiIiIlilIi = tick;
      this.IlIlilIillIlilIi = face;
   }

   public boolean IIlilIliiIli() {
      return this.iIllilIiIlllilIi > 2;
   }

   public lIIiiiIiiIIiiiIi Iliilliiilii() {
      return this.llllilIiilllilIi;
   }

   public Set<Integer> iIlIlllllill() {
      return Collections.unmodifiableSet(this.iiiIilIiIIIlilIi);
   }

   public boolean Iilililiiili() {
      return this.liIlilIiiiIlilIi >= 0;
   }

   public List<Integer> IIIllIIliIIl() {
      ArrayList var1 = new ArrayList();

      for (Integer var3 : this.IiiIilIiliiIilIi) {
         if (!this.iiiIilIiIIIlilIi.contains(var3)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public static Set<Integer> IlIillIiilIi(Map<String, String> props) {
      long var4 = -2363616345658954489L;
      TreeSet var1 = new TreeSet();
      if (props == null) {
         return var1;
      } else {
         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 6; var6 += 4294967296L) {
            String var3 = (String)props.get(iIiIilIiIliIilIi[(int)(var6 >>> 32)]);
            if (var3 != null && var3.trim().equalsIgnoreCase(lilIliilIl<"lilIliilIl","jJYjHn1rZNfxDZ0Motbnk5DzaEz+Tm4+bxkW+PWVZjM=">())) {
               var1.add((int)(var6 >>> 32));
            }
         }

         return var1;
      }
   }

   public void IllIllllIl() {
      this.liIlilIiiiIlilIi = -1;
      this.IIllilIilIllilIi = -1;
      this.iIllilIiIlllilIi = 0;
      this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.llIilIIlIi;
   }

   public int IIiilIiiiIii() {
      return this.liIlilIiiiIlilIi;
   }

   public int IIillIiliIil() {
      return this.IlIlilIillIlilIi;
   }

   public void iiIIlIIlIl(Set<Integer> presentFaces, int tick) {
      this.lIlIliIlIl(presentFaces, presentFaces, tick);
   }

   public static long Iiilliiliiil(long cell, int face) {
      return llIiIiililIiIiil.IIIllIIliIIl(
         llIiIiililIiIiil.IiIlliIliiIl(cell) + illIilIiIilIilIi[face],
         llIiIiililIiIiil.IIlllIlliIll(cell) + lilIilIiiilIilIi[face],
         llIiIiililIiIiil.Illlllllilll(cell) + IIiIilIilIiIilIi[face]
      );
   }

   public int IiIIlliIIl() {
      return this.iIllilIiIlllilIi;
   }

   public boolean lIiiIiIlilli() {
      return this.iiiIilIiIIIlilIi.equals(this.IiiIilIiliiIilIi);
   }

   public lIIllliliIIlllil IlIlllIlilIl(IntPredicate supportSolid) {
      for (Integer var3 : this.IIIllIIliIIl()) {
         if (supportSolid == null || supportSolid.test(var3)) {
            return new lIIllliliIIlllil(var3, Iiilliiliiil(this.lliIilIiiliIilIi, var3), IIIilIIiiIIi(var3));
         }
      }

      return null;
   }

   public boolean iliIiiliiiii() {
      for (Integer var2 : this.iiiIilIiIIIlilIi) {
         if (!this.IiiIilIiliiIilIi.contains(var2)) {
            return true;
         }
      }

      return false;
   }

   public Set<Integer> liiiIIllIl() {
      return this.IiiIilIiliiIilIi;
   }

   public int llIIlilIIl() {
      return this.lIililIiiIililIi;
   }

   public String illIlIilIl() {
      return String.format(
         Locale.ROOT,
         lilIliilIl<"lilIliilIl","tJTWpAdVqYxCRcseZPygZMvQ5Ovo/za4xVrBgailOcnNG4+iM00VCS2gQJL4utZOyZDRn4R/aSqv/BOKf4fFVF9UvAW+HaDYPDDKs5MpIv1mn8abxM5DApXSFgNR8tsGdY5qPImQ1dP1/CeulqgLZO8DC5AUA8stJOquWNNECzTF8HypASHFf6VHGOeONeJXl8k8rZO3mDVtOHZy4aJrKvevP3B8xQwHdBeIeMD14w0=">(),
         this.lliIilIiiliIilIi,
         this.IiiIilIiliiIilIi,
         this.iiiIilIiIIIlilIi,
         this.IIIllIIliIIl(),
         this.lIiiIiIlilli(),
         this.lIIlilIiiIIlilIi,
         this.llllilIiilllilIi,
         this.liIlilIiiiIlilIi,
         this.IillilIilillilIi,
         this.iillilIiIIililIi,
         this.lIililIiiIililIi,
         this.iIllilIiIlllilIi,
         this.IlililIillililIi
      );
   }

   public Set<Long> IIlllIlliIll(IntPredicate supportSolid) {
      LinkedHashSet var2 = new LinkedHashSet();

      for (Integer var4 : this.IiIlliIliiIl(supportSolid)) {
         var2.add(Iiilliiliiil(this.lliIilIiiliIilIi, var4));
      }

      return var2;
   }

   public static int IIIilIIiiIIi(int face) {
      return IllIilIilllIilIi[face];
   }

   public List<Integer> IiIlliIliiIl(IntPredicate supportSolid) {
      ArrayList var2 = new ArrayList();
      if (supportSolid == null) {
         return var2;
      } else {
         for (Integer var4 : this.IIIllIIliIIl()) {
            if (!supportSolid.test(var4)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   public long IliIlllilIi() {
      return this.lliIilIiiliIilIi;
   }

   public int Ililllililil() {
      return this.ilIlilIiIiIlilIi;
   }

   public boolean IiIiliIiiiIi(int timeoutTicks, int tick, int face) {
      if (timeoutTicks >= 0 && timeoutTicks < 6 && this.iiiIilIiIIIlilIi.contains(timeoutTicks)) {
         this.lIililIiiIililIi++;
         return false;
      } else {
         if (this.liIlilIiiiIlilIi >= 0) {
            if (tick - this.IIllilIilIllilIi < Math.max(1, face)) {
               this.lIililIiiIililIi++;
               return false;
            }

            this.llllilIiilllilIi = lIIiiiIiiIIiiiIi.liIilIIlIi;
            this.iillilIiIIililIi++;
            this.iIllilIiIlllilIi++;
            this.liIlilIiiiIlilIi = -1;
            this.IIllilIilIllilIi = -1;
         }

         return this.iIllilIiIlllilIi <= 2;
      }
   }

   public int iIIIlIlIIl() {
      return this.iillilIiIIililIi;
   }
}
