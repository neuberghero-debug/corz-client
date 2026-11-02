package gg.corz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public record ililllilIiilllil(
   int v, String name, String uuid, long updated, int fights, iilIlIilIIiIlIil cal, lliiliiliili habits, Map<String, Map<String, double[]>> arms, int[] stats
) {
   private final Map<String, Map<String, double[]>> iillliiIil;
   private final int illlliiIil;
   private final String IlllliiIil;
   private final String iIllliiIil;
   private final int[] IIilliiIil;
   private final lliiliiliili lillliiIil;
   private final iilIlIilIIiIlIil IillliiIil;
   private final int lIllliiIil;
   private final long llllliiIil;

   public String lIiiIiIlilli() {
      return this.IlllliiIil;
   }

   public long iliIiiliiiii() {
      return this.llllliiIil;
   }

   private static boolean IliIlllilIi(Map<String, Map<String, double[]>> b, Map<String, Map<String, double[]>> a) {
      if (b == a) {
         return true;
      } else if (b != null && a != null && b.size() == a.size()) {
         label47:
         for (Entry var3 : b.entrySet()) {
            Map var4 = (Map)var3.getValue();
            Map var5 = (Map)a.get(var3.getKey());
            if (var4 != var5) {
               if (var4 != null && var5 != null && var4.size() == var5.size()) {
                  Iterator var6 = var4.entrySet().iterator();

                  Entry var7;
                  do {
                     if (!var6.hasNext()) {
                        continue label47;
                     }

                     var7 = (Entry)var6.next();
                  } while (var5.containsKey(var7.getKey()) && Arrays.equals((double[])var7.getValue(), (double[])var5.get(var7.getKey())));

                  return false;
               }

               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public int iIlIlllllill() {
      return this.lIllliiIil;
   }

   public int[] Illlllllilll() {
      return this.IIilliiIil;
   }

   public lliiliiliili IiIlliIliiIl() {
      return this.lillliiIil;
   }

   private static int liiiIIllIl(Map<String, Map<String, double[]>> arms) {
      long var7 = -5913062332573240302L;
      if (arms == null) {
         return 0;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;

         for (Entry var3 : arms.entrySet()) {
            var7 ^= (0L ^ var7) & -1L >>> 32;
            if (var3.getValue() != null) {
               for (Entry var6 : ((Map)var3.getValue()).entrySet()) {
                  var7 ^= ((long)((int)var7 + (Objects.hashCode(var6.getKey()) ^ Arrays.hashCode((double[])var6.getValue()))) ^ var7) & -1L >>> 32;
               }
            }

            var7 ^= ((long)((int)(var7 >>> 32) + (Objects.hashCode(var3.getKey()) ^ (int)var7)) << 32 ^ var7) & -1L << 32;
         }

         return (int)(var7 >>> 32);
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(Iilllilliill<"Iilllilliill","Po81YXLrICldr3hx15nMkMJbuBtKt5T0ehRNZ9oTx3C2Yw0Dao5aNdx377I3">())
         .append(this.lIllliiIil)
         .append(Iilllilliill<"Iilllilliill","Mm+YhEWCiv7+5nb07iV2dQBpcrIa8E55pGpu3d2XoPhyVBY=">())
         .append(this.iIllliiIil)
         .append(Iilllilliill<"Iilllilliill","bAbLifiDNPTr+IEGfrMIzUSS79Gg614lH5IEsmJWRvKU8dE=">())
         .append(this.IlllliiIil)
         .append(Iilllilliill<"Iilllilliill","A56ScU7xarlvDM++om1LKPAwhQSTJhmkgJ+vNyanQgKx3OhLLgs=">())
         .append(this.llllliiIil)
         .append(Iilllilliill<"Iilllilliill","I3WCNnEV+eh6BWRnlnO15N8sSwLbkZ0fLIHW9WlLKsfgkkCCvA==">())
         .append(this.illlliiIil)
         .append(Iilllilliill<"Iilllilliill","AyCOJoobIKoNJJPnb4NJCOHDgQf9n0g+jUyJYkYjyf/hJA==">())
         .append(this.IillliiIil)
         .append(Iilllilliill<"Iilllilliill","agJYeX9YO5p9V8e4RPOJNvE25VOSGuQi8IxYwEbRvcNgkeCajg==">())
         .append(this.lillliiIil)
         .append(Iilllilliill<"Iilllilliill","E4+qxRGnlNpEeBgOZ+hpK5FBsXtqC7gq3DWVVTZlppgPbkN5">());
      if (this.iillliiIil != null) {
         for (Entry var3 : this.iillliiIil.entrySet()) {
            var1.append((String)var3.getKey()).append(Iilllilliill<"Iilllilliill","bdK/KeyGz2YB7M/Rdpxl88zw0aOWFBHAo7RYabRE">());
            if (var3.getValue() != null) {
               for (Entry var5 : ((Map)var3.getValue()).entrySet()) {
                  var1.append((String)var5.getKey()).append('=').append(Arrays.toString((double[])var5.getValue())).append(' ');
               }
            }

            var1.append(Iilllilliill<"Iilllilliill","Jiw3V+krdJGJgc9s9ImnX/FI11Hr7OrMJOyvwHIQ">());
         }
      }

      return var1.append(Iilllilliill<"Iilllilliill","BOKKfLEcXnCiupAdbdFeasm0vSHKIgx1l/PdsheYou+oJU6LAQ==">())
         .append(Arrays.toString(this.IIilliiIil))
         .append(']')
         .toString();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else {
         return !(o instanceof ililllilIiilllil var2)
            ? false
            : this.lIllliiIil == var2.lIllliiIil
               && this.llllliiIil == var2.llllliiIil
               && this.illlliiIil == var2.illlliiIil
               && Objects.equals(this.iIllliiIil, var2.iIllliiIil)
               && Objects.equals(this.IlllliiIil, var2.IlllliiIil)
               && Objects.equals(this.IillliiIil, var2.IillliiIil)
               && Objects.equals(this.lillliiIil, var2.lillliiIil)
               && IliIlllilIi(this.iillliiIil, var2.iillliiIil)
               && Arrays.equals(this.IIilliiIil, var2.IIilliiIil);
      }
   }

   public ililllilIiilllil(
      int v,
      String name,
      String uuid,
      long updated,
      int fights,
      iilIlIilIIiIlIil cal,
      lliiliiliili habits,
      Map<String, Map<String, double[]>> arms,
      int[] stats
   ) {
      this.lIllliiIil = v;
      this.iIllliiIil = name;
      this.IlllliiIil = uuid;
      this.llllliiIil = updated;
      this.illlliiIil = fights;
      this.IillliiIil = cal;
      this.lillliiIil = habits;
      this.iillliiIil = arms;
      this.IIilliiIil = stats;
   }

   public int IIIllIIliIIl() {
      return this.illlliiIil;
   }

   public String IilliliilIIi() {
      return this.iIllliiIil;
   }

   @Override
   public int hashCode() {
      long var2 = 5829920984602847456L;
      var2 ^= (
            (long)Objects.hash(this.lIllliiIil, this.iIllliiIil, this.IlllliiIil, this.llllliiIil, this.illlliiIil, this.IillliiIil, this.lillliiIil) << 32
               ^ var2
         )
         & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + liiiIIllIl(this.iillliiIil)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IIilliiIil);
   }

   public Map<String, Map<String, double[]>> IIlllIlliIll() {
      return this.iillliiIil;
   }

   public iilIlIilIIiIlIil IlIlllIlilIl() {
      return this.IillliiIil;
   }
}
