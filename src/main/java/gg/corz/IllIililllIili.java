package gg.corz;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public final class IllIililllIili {
   private int IIlliiIIIl;
   private int lIlliiIIIl;
   public static final int IiIliiIIIl = 1024;
   private final LinkedHashMap<Long, lIlllIliiIlllIli> iiIliiIIIl = new LinkedHashMap<Long, lIlllIliiIlllIli>(16, 0.75F, false) {
      @Override
      protected boolean removeEldestEntry(Entry<Long, lIlllIliiIlllIli> e) {
         return this.size() > 1024;
      }
   };
   private liliiliiliil iIlliiIIIl;
   private static final lIllIIIiiIllIIIi[] liIliiIIIl = new lIllIIIiiIllIIIi[]{
      lIllIIIiiIllIIIi.lIlIlIliil,
      lIllIIIiiIllIIIi.iIlIlIliil,
      lIllIIIiiIllIIIi.IllIlIliil,
      lIllIIIiiIllIIIi.lllIlIliil,
      lIllIIIiiIllIIIi.illIlIliil,
      lIllIIIiiIllIIIi.IilIlIliil,
      lIllIIIiiIllIIIi.lilIlIliil,
      lIllIIIiiIllIIIi.iilIlIliil
   };
   public static final String ilIliiIIIl = "COMPLETION_ACCESS_ESCALATION_REQUIRED";

   public int IlIlllIlilIl() {
      return this.iiIliiIIIl.size();
   }

   public static liliiliiliil IliIlllilIi(int epochAdvancedSinceLastPlan, int remaining, boolean triedThisEpoch, Set<lIllIIIiiIllIIIi> steps) {
      long var9 = -3740843229553196550L;
      if (epochAdvancedSinceLastPlan <= 0) {
         return new liliiliiliil(
            IlililIillililIi.IliIillIIi, null, Iilllilliill<"Iilllilliill","EUGYM4lGsu6M8WIslPwtVVxiSUQp5pytQmhLALFLEA/V7DVBASIx8SlE2dFc">()
         );
      } else if (remaining > 0) {
         return new liliiliiliil(
            IlililIillililIi.iIiIillIIi,
            null,
            Iilllilliill<"Iilllilliill","B4dp+XkFSi7/x95d9zCyLoAZYpzfaAxJBdfWYLMsCKZkDulS8Q==">()
               + remaining
               + Iilllilliill<"Iilllilliill","W07T7ZJi81iO9q5LSPFDLa2EKtzUT/Op862zRlZVAjubWT0zsstBskdMWA953wa7ig==">()
               + epochAdvancedSinceLastPlan
         );
      } else if (triedThisEpoch) {
         return new liliiliiliil(
            IlililIillililIi.IliIillIIi,
            null,
            Iilllilliill<"Iilllilliill","DrpEqEC+UeaHFIcfmWmFHLNbO0Oydd+n0ew7PTSFLYLjKnyZjWiFFYNQ8t4mrBp+GUqEozMLifouv2EmSn0O3qrrdNZkcsbBL5OXbyZun+68+i1q3WLeUIQE3OJB8kjjc82Z7v7TA2lCFZYNm0BlBS/xEPec">()
               + epochAdvancedSinceLastPlan
         );
      } else {
         Set var4 = steps == null ? Set.of() : steps;
         lIllIIIiiIllIIIi[] var5 = liIliiIIIl;
         var9 ^= ((long)var5.length << 32 ^ var9) & -1L << 32;

         for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            lIllIIIiiIllIIIi var8 = var5[(int)var12];
            if (var8 == lIllIIIiiIllIIIi.iilIlIliil) {
               break;
            }

            if (!var4.contains(var8)) {
               return new liliiliiliil(
                  IlililIillililIi.lliIillIIi,
                  var8,
                  Iilllilliill<"Iilllilliill","l1FPmehLVO+l+3/Rw1zQs+x+SddAsOnslV7WT+m4Td36ED7BE4PLY1y5tXPVDS4L2hMGNVtGnt51sZrFLjUm2cizyYEZ/gTlaBxv+A==">()
                     + epochAdvancedSinceLastPlan
                     + Iilllilliill<"Iilllilliill","z09k2mE5v2ZueOxjlDieiopL6cbWECvlfIf9/NpnhXSzW2Bof61gqVRjuZEFWSydiKgeeOsTzF6t">()
                     + var8
                     + Iilllilliill<"Iilllilliill","l3iVhA0Rw1MHddXF5EFneZI3DuSJxuU616A88EhmlDuHGuo=">()
                     + var4.size()
               );
            }
         }

         return new liliiliiliil(
            IlililIillililIi.iliIillIIi,
            lIllIIIiiIllIIIi.iilIlIliil,
            Iilllilliill<"Iilllilliill","l1FPmehLVO+l+3/Rw1zQs+x+SddAsOnslV7WT+m4Td36ED7BE4PLY1y5tXPVDS4L2hMGNVtGnt51sZrFLjUm2cizyYEZ/gTlaBxv+A==">()
               + epochAdvancedSinceLastPlan
               + Iilllilliill<"Iilllilliill","wGVYrOsp9UZQjq8vV+eS5+JPem3nE9qMQUF28unL2hn9ubfdhgm7Mgu0l1MBUcNmV1YOhC9v+Mo8qAbohsLBk/fM/i8M0W2eqZ8dHBr5tmLJDdhnSUKJ8vpCUg==">()
               + lIllIIIiiIllIIIi.iilIlIliil
         );
      }
   }

   public int iliIiiliiiii() {
      return this.IIlliiIIIl;
   }

   public liliiliiliil IiIlliIliiIl() {
      return this.iIlliiIIIl;
   }

   public static lIllIIIiiIllIIIi[] liiiIIllIl() {
      return (lIllIIIiiIllIIIi[])liIliiIIIl.clone();
   }

   public void IIlllIlliIll() {
      this.iiIliiIIIl.clear();
      this.IIlliiIIIl = 0;
      this.lIlliiIIIl = 0;
      this.iIlliiIIIl = null;
   }

   public liliiliiliil lIiiIiIlilli(long remaining, long steps, int epochAdvancedSinceLastPlan, int familyKey, boolean epoch) {
      liliiliiliil var8 = IliIlllilIi(epochAdvancedSinceLastPlan, familyKey, epoch, this.iIlIlllllill(remaining, steps));
      if (var8.liiiIIllIl() == IlililIillililIi.lliIillIIi) {
         this.IilliliilIIi(remaining, steps, var8.iIlIlllllill());
         this.IIlliiIIIl++;
      } else if (var8.liiiIIllIl() == IlililIillililIi.iliIillIIi) {
         this.IilliliilIIi(remaining, steps, var8.iIlIlllllill());
         this.lIlliiIIIl++;
      }

      this.iIlliiIIIl = var8;
      return var8;
   }

   public Set<lIllIIIiiIllIIIi> iIlIlllllill(long epoch, long familyKey) {
      lIlllIliiIlllIli var5 = this.iiIliiIIIl.get(epoch);
      return var5 != null && var5.lIIilIllIi == familyKey ? Collections.unmodifiableSet(var5.iIIilIllIi) : Set.of();
   }

   public String Illlllllilll() {
      return Iilllilliill<"Iilllilliill","ikTojREZ6Qfv3gLtTP6fLcwhHzXI9ZNG07EDFb1Sq8xu9l/s7g==">()
         + this.iiIliiIIIl.size()
         + Iilllilliill<"Iilllilliill","wLpVcLm5eazkXbH03u5qU/aw4ixzDk6ba6AiiNI5HxTe7Bz08u/YuYc=">()
         + this.IIlliiIIIl
         + Iilllilliill<"Iilllilliill","pq30HK4H/lSAjqCjDRE+KMp786GtKMp68u6fTaeADd2ve59qOmrkBg==">()
         + this.lIlliiIIIl
         + Iilllilliill<"Iilllilliill","oeUn0peSrlRSLbz/3SNb/8z7GjBhs5o67mT0osyFflyULQ==">()
         + (
            this.iIlliiIIIl == null
               ? Iilllilliill<"Iilllilliill","joZ6qwTG+GkWyNLF5jrQtJLCs2Gm/Bpevkbuvjo=">()
               : this.iIlliiIIIl.liiiIIllIl()
                  + (
                     this.iIlliiIIIl.iIlIlllllill() == null
                        ? ""
                        : Iilllilliill<"Iilllilliill","8YIR4BlMsT70PY4hoyMWWMyaeQkhOOHIyfKIlhQ=">() + this.iIlliiIIIl.iIlIlllllill()
                  )
         );
   }

   public void IilliliilIIi(long epoch, long s, lIllIIIiiIllIIIi familyKey) {
      if (familyKey != null) {
         lIlllIliiIlllIli var6 = this.iiIliiIIIl.get(epoch);
         if (var6 == null) {
            var6 = new lIlllIliiIlllIli(s);
            this.iiIliiIIIl.put(Long.valueOf(epoch), var6);
         } else if (var6.lIIilIllIi != s) {
            var6.lIIilIllIi = s;
            var6.iIIilIllIi.clear();
         }

         var6.iIIilIllIi.add(familyKey);
      }
   }

   public int IIIllIIliIIl() {
      return this.lIlliiIIIl;
   }
}
