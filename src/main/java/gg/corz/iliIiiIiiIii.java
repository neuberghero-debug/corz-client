package gg.corz;

import java.util.List;
import net.minecraft.class_2248;
import net.minecraft.class_5321;
import net.minecraft.class_6796;

record iliIiiIiiIii(iiIiiilIIliiil toggle, List<class_5321<class_6796>> keys, List<class_2248> blocks) {
   private final List<class_2248> IliiIilIllliiIilIl;
   private final iiIiiilIIliiil iiliIilIlIIiiIilIl;
   private final List<class_5321<class_6796>> lIiiIilIliIiiIilIl;

   public List<class_2248> iIlIlllllill() {
      return this.IliiIilIllliiIilIl;
   }

   public List<class_5321<class_6796>> liiiIIllIl() {
      return this.lIiiIilIliIiiIilIl;
   }

   private iliIiiIiiIii(iiIiiilIIliiil toggle, List<class_5321<class_6796>> keys, List<class_2248> blocks) {
      this.iiliIilIlIIiiIilIl = toggle;
      this.lIiiIilIliIiiIilIl = keys;
      this.IliiIilIllliiIilIl = blocks;
   }

   public iiIiiilIIliiil IliIlllilIi() {
      return this.iiliIilIlIIiiIilIl;
   }
}
