create_datapack('crab_claw', 
{ 
        'data' -> { 'minecraft' -> { 'loot_table' -> { 'gameplay' -> { 'fishing' -> { 'treasure.json' -> {
            'type' -> 'minecraft:fishing',
            'pools' -> [
            {
                'bonus_rolls' -> 0,
                'entries' -> [
                    {
                      'type' -> 'minecraft:item',
                      'functions' -> [
                        {
                          'function' -> 'minecraft:set_custom_data',
                          'tag' -> '{"crab":true}',
                          'options' -> '#minecraft:on_random_loot'
                        },
                        {
                          'function' -> 'minecraft:set_custom_model_data',
                          'strings' -> {
                            'values' -> ['crab_claw'],
                            'mode' -> 'append'
                          }
                        },
                        {
                          'function' -> 'minecraft:set_name',
                          'name' -> {
                            'text' -> 'Клешня краба',
                            'color' -> 'light_purple',
                            'italic' -> false
                          }
                        },
                        {
                          'function' -> 'minecraft:set_components',
                          'components' -> {
                          'attribute_modifiers' -> [
                              {
                                'type' -> 'block_interaction_range',
                                'amount' -> 2.5,
                                'operation' -> 'add_value',
                                'id' -> 'crab:crab_block_modifier'
                              }
                            ]
                          }
                        }
                      ],
                      'name' -> 'minecraft:shears'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'name' -> 'minecraft:name_tag'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'name' -> 'minecraft:saddle'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'functions' -> [
                        {
                          'add' -> false,
                          'damage' -> {
                            'type' -> 'minecraft:uniform',
                            'max' -> 0.25,
                            'min' -> 0.0
                          },
                          'function' -> 'minecraft:set_damage'
                        },
                        {
                          'function' -> 'minecraft:enchant_with_levels',
                          'levels' -> 30.0,
                          'options' -> '#minecraft:on_random_loot'
                        }
                      ],
                      'name' -> 'minecraft:bow'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'functions' -> [
                        {
                          'add' -> false,
                          'damage' -> {
                            'type' -> 'minecraft:uniform',
                            'max' -> 0.25,
                            'min' -> 0.0
                          },
                          'function' -> 'minecraft:set_damage'
                        },
                        {
                          'function' -> 'minecraft:enchant_with_levels',
                          'levels' -> 30.0,
                          'options' -> '#minecraft:on_random_loot'
                        }
                      ],
                      'name' -> 'minecraft:fishing_rod'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'functions' -> [
                        {
                          'function' -> 'minecraft:enchant_with_levels',
                          'levels' -> 30.0,
                          'options' -> '#minecraft:on_random_loot'
                        }
                      ],
                      'name' -> 'minecraft:book'
                    },
                    {
                      'type' -> 'minecraft:item',
                      'name' -> 'minecraft:nautilus_shell'
                    }
                  ],
                  'rolls' -> 1
                }
           ],
          'random_sequence' -> 'minecraft:gameplay/fishing/treasure'
        } }
} } } } })
