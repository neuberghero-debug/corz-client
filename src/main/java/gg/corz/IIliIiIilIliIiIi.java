package gg.corz;

import com.google.gson.JsonObject;

public final class IIliIiIilIliIiIi {
   public boolean liiilIiIIi = true;
   private static final int[] IIiilIiIIi = new int[]{-11549705, -18611, -8271996, -1739917, -4560696, -11677471, -10929, -1023342, -6190977, -7297874};
   public boolean IIIIiIiIIi = true;
   public final int IllIiIiIIi;
   public String IliilIiIIi;
   public int lIlIiIiIIi;
   public String iIiilIiIIi;
   public long IiiilIiIIi;
   public final String lIiilIiIIi;
   public double IiIIiIiIIi;
   public lliIiIIliliIiIIl iIIIiIiIIi;
   public liiiiilliiiiiill iiiilIiIIi;
   public boolean iliilIiIIi;
   public double llIIiIiIIi;
   public long lliilIiIIi;
   public IiiIIlllliiIIlll iIlIiIiIIi;
   public iliiiIIiIiiiiIIi lIIIiIiIIi = iliiiIIiIiiiiIIi.llliliiiil;
   public boolean IlIIiIiIIi;
   public double liIIiIiIIi;
   public String iiIIiIiIIi;
   public int IIlIiIiIIi;

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","tFyAoliM/NsR7Sm0W8QM9VOZhL2mbKK/qMlW53z6J5M=">(), this.lIIIiIiIIi.name());
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","ujFpG81Rz22rmMwNwyQeIJs8hFfpuWcuV2AqnIlXJA==">(), this.iIIIiIiIIi.name());
      if (this.IlIIiIiIIi) {
         var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","f8JOvMra3KuvTKAyvjpcZfsuDF6DZoA0d1idIA4=">(), this.llIIiIiIIi);
         var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","+O0If8+VVHxh6JzJGNzaaBpYIy8y52cv27S8+04=">(), this.IiIIiIiIIi);
         var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","/wWW2UJv03wy9mImv6j3B63zJrnc7xQT5EDuJ2U=">(), this.liIIiIiIIi);
      }

      if (this.iiIIiIiIIi != null && !this.iiIIiIiIIi.isEmpty()) {
         var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","pJq98h/1sbKQ+LZNcmWlkccMppjm1Q/y54AlsffKLQ==">(), this.iiIIiIiIIi);
      }

      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","enMqKmSM+XmMQ0EUaH+HK0J+550VA4C8yGl1uq5i1Q==">(), this.IIlIiIiIIi);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","1icmMuA66aSqWZvoipiw7VEcfa9Qqd07AdZ1QHc5rtM=">(), this.lIlIiIiIIi);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","P4TbhFZ/NJORbvTqCg2WVwQnw3bVGZp7Yfyns1T1">(), this.IIIIiIiIIi);
      if (!this.iIlIiIiIIi.IilliliilIIi()) {
         var1.add(IIIllIIliIIl<"IIIllIIliIIl","f6O/9fFSa/Uub/MeWl0krOdJ9dUIZGLeuvmWSLHcM+w=">(), this.iIlIiIiIIi.IIIllIIliIIl());
      }

      return var1;
   }

   public IIliIiIilIliIiIi(String id) {
      this.iIIIiIiIIi = lliIiIIliliIiIIl.IIIllIilIl;
      this.iiIIiIiIIi = "";
      this.iIlIiIiIIi = new IiiIIlllliiIIlll();
      this.lIiilIiIIi = id == null ? "" : id;
      this.IllIiIiIIi = IIiilIiIIi[Math.floorMod(this.lIiilIiIIi.hashCode(), IIiilIiIIi.length)];
   }

   public String liiiIIllIl() {
      return this.iIiilIiIIi != null && !this.iIiilIiIIi.isBlank() ? this.iIiilIiIIi : this.lIiilIiIIi.substring(0, Math.min(6, this.lIiilIiIIi.length()));
   }

   public double iliIiiliiiii(double px, double py, double pz) {
      double var7 = this.llIIiIiIIi - px;
      double var9 = this.IiIIiIiIIi - py;
      double var11 = this.liIIiIiIIi - pz;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public void IilliliilIIi(JsonObject s) {
      if (s != null) {
         this.lIIIiIiIIi = iliiiIIiIiiiiIIi.IliIlllilIi(
            s.has(IIIllIIliIIl<"IIIllIIliIIl","tFyAoliM/NsR7Sm0W8QM9VOZhL2mbKK/qMlW53z6J5M=">())
               ? s.get(IIIllIIliIIl<"IIIllIIliIIl","tFyAoliM/NsR7Sm0W8QM9VOZhL2mbKK/qMlW53z6J5M=">()).getAsString()
               : null
         );
         this.iIIIiIiIIi = lliIiIIliliIiIIl.IliIlllilIi(
            s.has(IIIllIIliIIl<"IIIllIIliIIl","ujFpG81Rz22rmMwNwyQeIJs8hFfpuWcuV2AqnIlXJA==">())
               ? s.get(IIIllIIliIIl<"IIIllIIliIIl","ujFpG81Rz22rmMwNwyQeIJs8hFfpuWcuV2AqnIlXJA==">()).getAsString()
               : null
         );
         if (s.has(IIIllIIliIIl<"IIIllIIliIIl","f8JOvMra3KuvTKAyvjpcZfsuDF6DZoA0d1idIA4=">())
            && s.has(IIIllIIliIIl<"IIIllIIliIIl","+O0If8+VVHxh6JzJGNzaaBpYIy8y52cv27S8+04=">())
            && s.has(IIIllIIliIIl<"IIIllIIliIIl","/wWW2UJv03wy9mImv6j3B63zJrnc7xQT5EDuJ2U=">())) {
            try {
               this.llIIiIiIIi = s.get(IIIllIIliIIl<"IIIllIIliIIl","f8JOvMra3KuvTKAyvjpcZfsuDF6DZoA0d1idIA4=">()).getAsDouble();
               this.IiIIiIiIIi = s.get(IIIllIIliIIl<"IIIllIIliIIl","+O0If8+VVHxh6JzJGNzaaBpYIy8y52cv27S8+04=">()).getAsDouble();
               this.liIIiIiIIi = s.get(IIIllIIliIIl<"IIIllIIliIIl","/wWW2UJv03wy9mImv6j3B63zJrnc7xQT5EDuJ2U=">()).getAsDouble();
               this.IlIIiIiIIi = true;
            } catch (Exception var3) {
            }
         }

         this.iiIIiIiIIi = s.has(IIIllIIliIIl<"IIIllIIliIIl","pJq98h/1sbKQ+LZNcmWlkccMppjm1Q/y54AlsffKLQ==">())
            ? s.get(IIIllIIliIIl<"IIIllIIliIIl","pJq98h/1sbKQ+LZNcmWlkccMppjm1Q/y54AlsffKLQ==">()).getAsString()
            : "";
         this.IIlIiIiIIi = s.has(IIIllIIliIIl<"IIIllIIliIIl","enMqKmSM+XmMQ0EUaH+HK0J+550VA4C8yGl1uq5i1Q==">())
            ? s.get(IIIllIIliIIl<"IIIllIIliIIl","enMqKmSM+XmMQ0EUaH+HK0J+550VA4C8yGl1uq5i1Q==">()).getAsInt()
            : 0;
         this.lIlIiIiIIi = s.has(IIIllIIliIIl<"IIIllIIliIIl","1icmMuA66aSqWZvoipiw7VEcfa9Qqd07AdZ1QHc5rtM=">())
            ? s.get(IIIllIIliIIl<"IIIllIIliIIl","1icmMuA66aSqWZvoipiw7VEcfa9Qqd07AdZ1QHc5rtM=">()).getAsInt()
            : 0;
         this.IIIIiIiIIi = !s.has(IIIllIIliIIl<"IIIllIIliIIl","P4TbhFZ/NJORbvTqCg2WVwQnw3bVGZp7Yfyns1T1">())
            || s.get(IIIllIIliIIl<"IIIllIIliIIl","P4TbhFZ/NJORbvTqCg2WVwQnw3bVGZp7Yfyns1T1">()).getAsBoolean();
         if (s.has(IIIllIIliIIl<"IIIllIIliIIl","f6O/9fFSa/Uub/MeWl0krOdJ9dUIZGLeuvmWSLHcM+w=">())
            && s.get(IIIllIIliIIl<"IIIllIIliIIl","f6O/9fFSa/Uub/MeWl0krOdJ9dUIZGLeuvmWSLHcM+w=">()).isJsonObject()) {
            this.iIlIiIiIIi = IiiIIlllliiIIlll.IlIlllIlilIl(s.getAsJsonObject(IIIllIIliIIl<"IIIllIIliIIl","f6O/9fFSa/Uub/MeWl0krOdJ9dUIZGLeuvmWSLHcM+w=">()));
         }
      }
   }

   public boolean IliIlllilIi() {
      return this.iiiilIiIIi == null || this.iiiilIiIIi == liiiiilliiiiiill.IiillIIIil;
   }

   public static IIliIiIilIliIiIi iIlIlllllill(JsonObject o) {
      if (o != null && o.has(IIIllIIliIIl<"IIIllIIliIIl","nxs6/EGDvRNjSbB/rQhjuZht0eQiRAlxLAiyzjWC">())) {
         IIliIiIilIliIiIi var1 = new IIliIiIilIliIiIi(o.get(IIIllIIliIIl<"IIIllIIliIIl","nxs6/EGDvRNjSbB/rQhjuZht0eQiRAlxLAiyzjWC">()).getAsString());
         var1.iIiilIiIIi = o.has(IIIllIIliIIl<"IIIllIIliIIl","sZn5Nl4IjzSvAUBphEKRYftLniKJEjtPTXxNUxyF7H0=">())
            ? o.get(IIIllIIliIIl<"IIIllIIliIIl","sZn5Nl4IjzSvAUBphEKRYftLniKJEjtPTXxNUxyF7H0=">()).getAsString()
            : var1.lIiilIiIIi;
         var1.IliilIiIIi = o.has(IIIllIIliIIl<"IIIllIIliIIl","MvrhdQn3bq0MsNdIjBJ9DpjdXT/jamEr/TPYV/cg+Ng=">())
            ? o.get(IIIllIIliIIl<"IIIllIIliIIl","MvrhdQn3bq0MsNdIjBJ9DpjdXT/jamEr/TPYV/cg+Ng=">()).getAsString()
            : "";
         var1.lliilIiIIi = o.has(IIIllIIliIIl<"IIIllIIliIIl","nRB5aI7b2NZDMBgxUe2FU/GUlLTs8fN8frT1OrZq7I2sLzzv">())
            ? o.get(IIIllIIliIIl<"IIIllIIliIIl","nRB5aI7b2NZDMBgxUe2FU/GUlLTs8fN8frT1OrZq7I2sLzzv">()).getAsLong()
            : 0L;
         var1.iliilIiIIi = !o.has(IIIllIIliIIl<"IIIllIIliIIl","e8KTVshQCIoNyrwqji+A0QOffkrCyUbMCl5ztF+/WNWpNg==">())
            || o.get(IIIllIIliIIl<"IIIllIIliIIl","e8KTVshQCIoNyrwqji+A0QOffkrCyUbMCl5ztF+/WNWpNg==">()).getAsBoolean();
         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","PaokPBQ1BDMcQlzmiDLIxYRZPELyf4vBs20dxp5MPTcO">())
            && o.get(IIIllIIliIIl<"IIIllIIliIIl","PaokPBQ1BDMcQlzmiDLIxYRZPELyf4vBs20dxp5MPTcO">()).isJsonObject()) {
            var1.IilliliilIIi(o.getAsJsonObject(IIIllIIliIIl<"IIIllIIliIIl","PaokPBQ1BDMcQlzmiDLIxYRZPELyf4vBs20dxp5MPTcO">()));
         }

         return var1;
      } else {
         return null;
      }
   }
}
